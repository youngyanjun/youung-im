package com.young.im.nettyserver;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;


/**
 * 自定义解码器
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        pipeline.addLast(new IdleStateHandler(10,10,10,TimeUnit.SECONDS));

        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new HttpObjectAggregator(1024 * 64));
        // ================以上都是用于支持http协议==================
        /**
         * websocket服务器处理的协议，用于指定客户端第一次连接的路由
         * 会处理握手等动作
         * 对websocket，都是以frames传输，不同类型数据对应frames不同
         * "/ws" 目标访问路径
         */

        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));
        //服务控制器
        pipeline.addLast(new ServerHandler());

    }
}
