package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 服务器的任务对象，完成服务端的基本任务。
 */
public class ServerThread implements Runnable{
    Socket client;
    Scanner scan;

    public ServerThread(Socket client, Scanner scan) {
        this.client = client;
        this.scan = scan;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), StandardCharsets.UTF_8));
            PrintWriter pw = new PrintWriter(client.getOutputStream(), true, StandardCharsets.UTF_8);
            System.out.println("接受客户端连接请求成功！");
            //2.获取客户端的输入
            System.out.println("接受数据开始……");
            InputClientMessage(br);
            System.out.println("接受数据结束！");
            //3.输出消息到客户端
            System.out.println("传输数据开始……");
            OutputServerMessage(pw, scan);
            System.out.println("传输数据结束！");
            System.out.println("交互结束！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 用于接受客户端发来的信息
     *
     * @param br 用于传入接受数据对象，接受数据
     */
    public void InputClientMessage(BufferedReader br) {
        try {
            String message = null;
            InetAddress inetAddress = this.client.getInetAddress();
            while (!"exit".equals((message = br.readLine()).toLowerCase()))
                System.out.println("client["+inetAddress.getHostAddress() +"]: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 用于服务器端向指定的客户端发送信息
     *
     * @param pw   传入输出对象，
     * @param scan 手动输入
     */
    public void OutputServerMessage(PrintWriter pw, Scanner scan) {

        String message;
        System.out.println("请输入需要传输到客户端的数据：");
        while (!"exit".equals((message = scan.nextLine()).toLowerCase())) {
            pw.println(message);
            System.out.println("请继续输入需要传输到服务端的数据：");
        }
        pw.println("exit");
        System.out.println("输入结束！");
    }
}
