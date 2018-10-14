package com.icinfo.netty.le4;

import com.icinfo.netty.le4.pool.NioSelectorRunnablePool;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class Start {
    public static void main(String[] args) {
        NioSelectorRunnablePool nioSelectorRunnablePool =
                new NioSelectorRunnablePool(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
        ServerBootstrap bootstrap = new ServerBootstrap(nioSelectorRunnablePool);
        bootstrap.bind(new InetSocketAddress(10010));
        System.out.println("start.....");

    }
}
