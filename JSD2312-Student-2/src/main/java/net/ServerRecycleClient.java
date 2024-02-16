package net;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * 模拟垃圾回收线程，做一个服务器端对客户端的对象的回收
 */
public class ServerRecycleClient implements Runnable{

    List<Socket> clients;
    List<Thread> threads;

    public ServerRecycleClient(List<Socket> clients, List<Thread> threads) {
        this.clients = clients;
        this.threads = threads;
    }

    @Override
    public void run() {
        //线程如何关闭？判断该线程是否还活着
        while(true)
        {
            try {
                check(clients,threads);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param clients 传入检查集合1
     * @param threads 传入检查集合2
     */
    public void check(List<Socket> clients, List<Thread> threads)
    {
        threads.forEach(thread->{
            if(! thread.isAlive())
            {
                try {
                    int k;
                    k = threads.indexOf(thread);
                    threads.remove(thread);
                    System.out.println("k的值是 ：" + k);
                    clients.get(k).close();
                    clients.remove(k);
                    System.out.println("一切执行成功！");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

