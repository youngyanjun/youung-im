package com.young.im.nettyserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
public class NettyServer {

    public void start(InetSocketAddress address) {
        //管理线程
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        //工作线程
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //工作线程 服务器启动器
            ServerBootstrap bootstrap = new ServerBootstrap()
                    //加入个管理线程和工作线程
                    .group(bossGroup, workerGroup)
                    //使用nio Scoket 通道
                    .channel(NioServerSocketChannel.class)
                    //监听的地址
                    .localAddress(address)
                    //解码编码器
                    .childHandler(new ServerChannelInitializer())
                    //设置队列大小
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    // 两小时内没有数据的通信时,TCP会自动发送一个活动探测数据报文
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            // 绑定端口，开始接收进来的连接
            ChannelFuture future = bootstrap.bind(29000).sync();
            //异步启动该通道
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            //异常
            e.printStackTrace();
            //关闭管理线程
            bossGroup.shutdownGracefully();
            //关闭工作线程
            workerGroup.shutdownGracefully();
        }
    }

}


