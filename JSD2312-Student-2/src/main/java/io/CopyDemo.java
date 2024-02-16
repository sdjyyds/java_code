package io;

import java.io.*;

/**
 * 高级流，（处理流的作用）
 *
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        doWay1();
        doWay2();
        doWay3();
        doWay4();
    }
    static void doWay1() throws IOException {
        FileInputStream input = new FileInputStream("a.png");
        FileOutputStream output = new FileOutputStream("a_copy.png");
        int b;
        long start = System.currentTimeMillis();
        while((b = input.read()) != -1)
        {
            output.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        input.close();
        output.close();
    }
    static  void doWay2() throws IOException {
        FileInputStream input = new FileInputStream("a.png");
        BufferedInputStream bufInput = new BufferedInputStream(input);
        FileOutputStream output = new FileOutputStream("a_copy.png");
          BufferedOutputStream bufOutput = new BufferedOutputStream(output);
        int b;
        long start = System.currentTimeMillis();
        while((b = bufInput.read()) != -1)
        {
            bufOutput.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        input.close();
        output.close();
    }

    static void doWay3 () throws IOException
    {
        FileInputStream input = new FileInputStream("a.png");
        FileOutputStream output = new FileOutputStream("a_copy.png");
        int len;
        byte[] bytes = new byte[1024 * 8];
        long start = System.currentTimeMillis();
        while((len = input.read(bytes)) != -1)
        {
            output.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        input.close();
        output.close();
    }

    static  void doWay4() throws IOException {
        FileInputStream input = new FileInputStream("a.png");
        BufferedInputStream bufInput = new BufferedInputStream(input);
        FileOutputStream output = new FileOutputStream("a_copy.png");
        BufferedOutputStream bufOutput = new BufferedOutputStream(output);
        int len;
        byte[] bytes = new byte[1024 * 8];
        long start = System.currentTimeMillis();
        while((len = bufInput.read(bytes)) != -1)
        {
            bufOutput.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        input.close();
        output.close();
    }
}
