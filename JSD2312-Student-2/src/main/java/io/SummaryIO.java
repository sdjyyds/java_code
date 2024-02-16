package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SummaryIO {
    public static void main(String[] args) throws IOException {

    }
    static void testBytesInput1() throws IOException {
        FileInputStream fis = new FileInputStream("0.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        byte[] bytes = new byte[1024 * 8];
        long start = System.currentTimeMillis();
        while((len = bis.read(bytes)) != -1)
        {
            stringBuilder.append(new String(bytes,0,len,StandardCharsets.UTF_8));
        }
        System.out.println(stringBuilder);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        bis.close();
    }

    static void testBytesOutput1() throws IOException {
        FileOutputStream fos = new FileOutputStream("2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        Scanner scan = new Scanner(System.in);
        byte a;
        while((a = scan.nextByte()) != -1)
        {
            bos.write(a);
        }
        bos.close();
        scan.close();
    }

    static void testBytesOutput2() throws IOException {
        FileOutputStream fos = new FileOutputStream("2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String message = " 今天是个上分的好日子~\n" + "哈哈哈哈";
        bos.write(message.getBytes());
        bos.close();
    }

    static<E> void OIS(E e) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("中西会.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User  user = (User)ois.readObject();
        System.out.println(user);
    }

    static<E> void OOS(E e) throws IOException {
        FileOutputStream fos = new FileOutputStream("中西会.onj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        System.out.println("写出完毕");
    }

    /**
     * 字符流
     * java.io.Printer,java.io.Writer
     * InputStreamPrinter,OutputStreamPrinter//字符流都是高级流//转换流
     * BufferPrinter,BufferWriter//字符缓冲流
     * PrintWriter 字符加入换行操作.PrintReader
     */

    static void SP1() throws IOException {
        FileInputStream fis = new FileInputStream("2.txt");
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        char[] ch = new char[1024 * 8];
        int len;
        StringBuilder sb = new StringBuilder();
        while((len = isr.read(ch)) != -1)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    static void SP2() throws IOException {
        FileInputStream fis = new FileInputStream("2.txt");
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        char ch;
        StringBuilder sb = new StringBuilder();
        while((ch = (char)isr.read()) != -1)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    //缓冲字符流
    static void BR() throws IOException {
        FileInputStream fis = new FileInputStream("2.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        char ch;
        StringBuilder sb = new StringBuilder();
        while((ch = (char)br.read()) != -1)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }
    static void BW() throws IOException {
        FileOutputStream fos = new FileOutputStream("2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        String str ="天空蔚蓝色，窗外有千纸鹤，你我弹琴写歌~";
        bw.write(str);
    }

    //高级串联流

    static void PW () throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("2.txt");
        pw.println("生命就像一条大河，把我困在这里，现实就像一把枷锁，这谜样的生活锋利如刀，一次次将我创伤，我想要的那种幸福，就在那片更远的天空");
        pw.println("天灰灰，会不会，让我忘了你是谁，哦夜越黑风违背难追难回味，哦，我的世界将被摧毁");
    }
}
