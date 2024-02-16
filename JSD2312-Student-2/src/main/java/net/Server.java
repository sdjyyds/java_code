package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 服务器的模拟
 */
public class Server {
    ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("启动完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        while(true) {
            try {
                Socket client = server.accept();
                System.out.println("连接完成");
                this.InputMessage(client);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void InputMessage(Socket client) {
            BufferedReader br = null;
            InputStreamReader isr = null;
            String Message = null;
            try {
                isr = new InputStreamReader(client.getInputStream(), StandardCharsets.UTF_8);
                br = new BufferedReader(isr);
                while (! "exit".equals(Message = br.readLine().toLowerCase())) {
                    System.out.println(Message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
//                try {
//                    if (br != null) br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
            }
    }

    public static void main(String[] args) throws IOException {
        Server server1 = new Server(9088);
        server1.start();
    }
}
