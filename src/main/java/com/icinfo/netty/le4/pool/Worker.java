package com.icinfo.netty.le4.pool;

import java.nio.channels.SocketChannel;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public interface Worker {
    /**
     * 加入一个新的客户端会话
     * @param channel
     */
    public void registerNewChannelTask(SocketChannel channel);


}
