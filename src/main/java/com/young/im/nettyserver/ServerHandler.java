package com.young.im.nettyserver;


import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.time.LocalDateTime;


public class ServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    // 用于记录和管理客户端所有的channel
    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
  /*  @Override
    public void channelActive(ChannelHandlerContext ctx) {

        System.out.println("channelActive----->");
    }*/

/*    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("server channelRead......");
        System.out.println(ctx.channel().remoteAddress()+"----->Server :"+ msg.toString());
        //将客户端的信息直接返回写入ctx
        ctx.write("server say :"+msg);
        //刷新缓存区
        ctx.flush();
    }*/

    /**
     * 业务读
     *
     * @param channelHandlerContext
     * @param msg
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame msg) throws Exception {
        // 获取客户端传输过来的消息
        String content = msg.text();
        System.out.println("接收到的数据:" + content);


        for (Channel client : clients) {
            client.writeAndFlush(new TextWebSocketFrame(
                    "[服务器在]" + LocalDateTime.now() + "接收到的消息是:" + content));

        }
    }

    /**
     * 当客户端连接服务器后，获取服务器channel，并且放到 channelGroup中进行管理
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        //当前连接数
        System.out.println("当前连接数为：" + clients.size());
        clients.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        // 当触发handlerRemoved，ChannelGroup会自动移除对应客户端channel
        System.out.println("客户端断开，channel对应的长id为" + ctx.channel().id().asLongText());
        System.out.println("客户端断开，channel对应的短id为" + ctx.channel().id().asShortText());
    }


    /**
     * 异常捕获
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
