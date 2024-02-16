package net;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    Socket client;
    public Client()
    {
        try {
            this.client = new Socket("127.0.0.1",9088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void outputToServer(Scanner scan)
    {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(this.client.getOutputStream(), true,StandardCharsets.UTF_8);
            String Message;
            while( ! "exit".equals(Message = scan.nextLine().toLowerCase()))
            {
                pw.println(Message);
            }
            pw.println(Message);
            pw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if (pw != null) pw.close();
        }
    }
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        Scanner scan = new Scanner(System.in);
        client.outputToServer(scan);
    }
}
