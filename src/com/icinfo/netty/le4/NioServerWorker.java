package com.icinfo.netty.le4;

import com.icinfo.netty.le4.pool.NioSelectorRunnablePool;
import com.icinfo.netty.le4.pool.Worker;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.Executor;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月03
 */
public class NioServerWorker extends AbstractNioSelector implements Worker {
    public NioServerWorker(Executor executor, String threadName, NioSelectorRunnablePool selectorRunnablePool) {
        super(executor, threadName, selectorRunnablePool);
    }

    @Override
    protected int select(Selector selector) throws IOException {
        return selector.select(500);
    }

    @Override
    protected void process(Selector selector) throws IOException {
        Iterator<SelectionKey> ite = selector.selectedKeys().iterator();
        while (ite.hasNext()){
            SelectionKey key = ite.next();
//            移除，防止重复处理
            ite.remove();
//            得到时间发生的socket通道
            SocketChannel channel = (SocketChannel) key.channel();
//            数据总长度
            int ret=0;
            boolean failure = true;
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            try {
                ret = channel.read(buffer);
                failure=false;
            } catch (IOException e) {
                e.printStackTrace();
            }
//            判断是否断开连接
            if (ret <=0 || failure){
                key.cancel();
                System.out.println("客户端断开连接");
            }else{
                System.out.println("收到数据："+new String(buffer.array()));
//             回写数据
                ByteBuffer outBf = ByteBuffer.wrap("收到\n".getBytes());
                channel.write(outBf);
            }

        }
    }

    /**
     * 加入一个新的socket客户端
     * @param channel
     */
    @Override
    public void registerNewChannelTask(final SocketChannel channel) {
       final Selector selector = this.selector;
       registerTask(new Runnable() {
           @Override
           public void run() {
               try {
                   channel.register(selector,SelectionKey.OP_READ);
               } catch (ClosedChannelException e) {
                   e.printStackTrace();
               }
           }
       });

    }
}
