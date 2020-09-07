package com.young.im.websocket;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.timeout.IdleStateEvent;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.MultiValueMap;
import org.yeauty.annotation.*;
import org.yeauty.pojo.Session;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(path = "/ws/{arg}"
        , host = "${ws.host}"
        , port = "${ws.port}"
        , childOptionSoKeepalive = "true"
        , allIdleTimeSeconds = "2000")
public class MyWebSocket {
    static Logger log = LoggerFactory.getLogger(MyWebSocket.class);

    public static MyWebSocket MyWebSocket;
    /**
     * 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
     */
    private static int onlineCount = 0;
    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
     * 使用ConcurrentHashMap 无法实现集群，
     */
    private static ConcurrentHashMap<String, MyWebSocket> webSocketMap = new ConcurrentHashMap<>();

    /**
     * 接收userId
     */
    private String userId = "";

    /**
     * 与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    private Session session;

    @BeforeHandshake
    public void handshake(Session session, HttpHeaders headers, @RequestParam MultiValueMap reqMap, @PathVariable String arg, @PathVariable Map pathMap) {
        session.setSubprotocols("stomp");
        System.out.println("Authentication success!");

        //验证用户是否登录

       /* if (!arg.equals("ok")) {
            System.out.println("Authentication failed!");
            session.close();
        }*/
        System.out.println("用户:" + arg +  ",sessionId:" + session.id() + "验证成功！");
    }

    @OnOpen
    public void onOpen(Session session, HttpHeaders headers, @RequestParam MultiValueMap reqMap, @PathVariable String arg, @PathVariable Map pathMap) {
        this.session = session;
        this.userId = arg;
        webSocketMap.put(arg, this);
        MyWebSocket.addOnlineCount();
        System.out.println("用户:" + arg +  ",sessionId:" + session.id() + "登录成功");
        System.out.println("当前在线用户:"+getOnlineCount());
        System.out.println("new connection");

    }

    @OnClose
    public void onClose(Session session) throws IOException {
        MyWebSocket.subOnlineCount();
        System.out.println("one connection closed");
        log.info("用户退出:" + session.id() + ",当前在线人数为:" + getOnlineCount());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        throwable.printStackTrace();
    }


    /**
     * 发送数据方法
     * @param message  消息实体
     * @param heartPackage  心跳包
     * @param session  netty session
     */
    @OnMessage
    public void onMessage(String message, String heartPackage, Session session) {
        log.info("用户消息:" + userId + ",报文:" + message);
        //可以群发消息
        //消息保存到数据库、redis
        if (StringUtils.isNotBlank(message)) {
            try {
                //解析发送的报文
                JSONObject jsonObject = JSON.parseObject(message);
                //追加发送人(防止串改)
                jsonObject.put("fromUserId", this.userId);
                String toUserId = jsonObject.getString("toUserId");
                //传送给对应toUserId用户的websocket
                if (StringUtils.isNotBlank(toUserId) && webSocketMap.containsKey(toUserId)) {
                    webSocketMap.get(toUserId).sendMessage(jsonObject.toJSONString());
                } else {
                    log.error("请求的userId:" + toUserId + "不在该服务器上");
                    //否则不在这个服务器上，发送到mysql或者redis
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.sendText(message);
    }


    /**
     * 发送自定义消息
     */
    public static void sendInfo(String message, @PathParam("userId") String userId, Session session) throws IOException {
        log.info("发送消息到:" + userId + "，报文:" + message);
        if (StringUtils.isNotBlank(userId) && webSocketMap.containsKey(userId)) {
            webSocketMap.get(userId).sendMessage(message);
        } else {
            log.error("用户" + userId + ",不在线！");
        }
    }



    @OnBinary
    public void onBinary(Session session, byte[] bytes) {
        for (byte b : bytes) {
            System.out.println(b);
        }
        session.sendBinary(bytes);
    }

    @OnEvent
    public void onEvent(Session session, Object evt) {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            switch (idleStateEvent.state()) {
                case READER_IDLE:
                    System.out.println("read idle");
                    break;
                case WRITER_IDLE:
                    System.out.println("write idle");
                    break;
                case ALL_IDLE:
                    System.out.println("all idle");
                    session.close();
                    break;
                default:
                    break;
            }
        }
    }


    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }

}
