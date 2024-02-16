package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * 集成的PrintWriter
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("2.txt");
        pw.println("今天是个上分的好日子~");
        pw.println("哈哈哈哈");
        System.out.println("写入完毕");
        pw.close();
    }
}
