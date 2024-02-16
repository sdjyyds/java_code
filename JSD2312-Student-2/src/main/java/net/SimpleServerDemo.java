package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 实现模拟服务器的功能：
 * 1.获取客户端的连接。
 * 2.写入数据到对应客户端。
 * 3.不关闭服务器
 */
public class SimpleServerDemo {
    ServerSocket sever;

    //1.创建服务器
    public SimpleServerDemo(int port) {
        try {
            //1.创建套接字
            this.sever = new ServerSocket();
            //2.绑定端口号
            this.sever.bind(new InetSocketAddress(port));
            System.out.println("服务器启动成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2.方法开始
    public void start(Scanner scan) {
        //接受多个客户端的请求，涉及多线程问题
        List<Socket> clients = new LinkedList<>();
        List<Thread> threads = new LinkedList<>();
        //2.先开启检查线程
        //线程如何关闭？判断该线程是否还活着--采用简单的循环监测，每5秒进行一次检查，如何实现--采用线程的方式实现
        Thread serverMOThread = new Thread(new ServerRecycleClient(clients,threads));
        serverMOThread.setDaemon(true);
        serverMOThread.start();
        while (true) {
            try {
                //1.接受客户端的连接请求
                //问题1：关闭流连接的问题，一旦关闭高级流，会传递关闭，因此再没有进行完所有的操作前，不能进行流的关闭。
                //问题2：是客户端来关闭还是服务端来关闭，本人采取两边同时关闭
                //问题3：需要将代码变短，即降低该类的负载--解决方案，该线程来解决输入和输出，将方法直接给这个类就行
                //关闭交给该线程，因为该线程未结束，表明交互还在进行，这里又产生新问题，如果一边先关闭，则会导致另一方的读写失败
                //调用等待某线程执行完毕的操作？等待客户端的响应？怎么做？
                //状态码来解决这个问题？完成响应传入exit信息就行了。
                //先实现
                //问题4：可以接受多少个客户端的连接
                //问题5：当客户端连接上限后，再开启一个新的服务器？？？显然不划算，先模拟，后解决。
                //采用数组的形式实现，又会设计线程和客户端的关闭，对于线程，如果已经结束，就需要删除该线程，
                //鉴于该元素变动过多，采用单链表的形式存储。
                clients.add(this.sever.accept());
                threads.add(new Thread(new ServerThread(clients.get(clients.size()-1),scan)));
                //1.启动该线程
                threads.get(threads.size()-1).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleServerDemo server1 = new SimpleServerDemo(8976);
        server1.start(scan);
    }
}
