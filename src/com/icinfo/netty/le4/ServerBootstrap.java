package com.icinfo.netty.le4;

import com.icinfo.netty.le4.pool.Boss;
import com.icinfo.netty.le4.pool.NioSelectorRunnablePool;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月03
 */
public class ServerBootstrap {
    private NioSelectorRunnablePool selectorRunnablePool;

    public ServerBootstrap(NioSelectorRunnablePool selectorRunnablePool) {
        this.selectorRunnablePool = selectorRunnablePool;
    }

    /**
     * 绑定端口
     * @param localAddress
     */
    public void bind(final SocketAddress localAddress){
        try {
//            获取一个ServerSocket
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
//            设置通道为非阻塞
            serverChannel.configureBlocking(false);
//            将该通道对应的ServerSocket绑定到port端口
            serverChannel.socket().bind(localAddress);
//            获取一个boss线程
            Boss boss = selectorRunnablePool.nextBoss();
//            向boss注册一个ServerSocket通道
            boss.registerAcceptChannelTask(serverChannel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
