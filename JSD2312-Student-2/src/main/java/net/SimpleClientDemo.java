package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 要求：
 * 1.创建客户端
 * 2.传输信息到服务器端
 * 3.获取服务器端发过来的数据
 */
public class SimpleClientDemo {
    Socket client;
    public SimpleClientDemo(String address,int port)
    {
        //1.创建客户端对象
        try {
            //1.创建套接字
            client = new Socket();
            //2.连接到客户端
            client.connect(new InetSocketAddress(address,port));
            System.out.println("客户端启动成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 1.向服务端发送信息
     * 2.接受服务器端发来的信息
     * @param scan 手动输入
     */
    public void start(Scanner scan)
    {
        try {
            //1.输出信息到服务器端
            System.out.println("传输数据开始……");
            OutputServerMessage(scan);
            System.out.println("传输数据结束！");
            //2.接受服务器端的信息
            System.out.println("接受数据开始……");
            InputServerMessage();
            System.out.println("接受数据结束！");
        } finally {
            if(client != null) {
                try {
                    this.client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("交互结束！");
        }
    }

    /**
     * 用于接受服务端发来的信息
     *
     */
    public void InputServerMessage() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            String message;
            while(! "exit".equals( (message = br.readLine()).toLowerCase()  ))
                System.out.println("server: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 用于客户端向服务器端发生数据
     * @param scan 手动输入
     */
    public void OutputServerMessage(Scanner scan) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(this.client.getOutputStream(), true);
            String message;
            System.out.println("请输入需要传输到服务端的数据：");
            while (!"exit".equals((message = scan.nextLine()).toLowerCase())) {
                pw.println(message);
                System.out.println("请继续输入需要传输到服务端的数据：");
            }
            pw.println("exit");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleClientDemo client1 = new SimpleClientDemo("127.0.0.1",8976);
        client1.start(scan);
    }
}

