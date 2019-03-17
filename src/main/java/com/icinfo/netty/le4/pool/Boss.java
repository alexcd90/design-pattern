package com.icinfo.netty.le4.pool;

import java.net.ServerSocket;
import java.nio.channels.ServerSocketChannel;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public interface Boss {
    /**
     * 加入一个新的ServerSocket
     * @param serverSocketChannel
     */
    public void registerAcceptChannelTask(ServerSocketChannel serverSocketChannel);
}
