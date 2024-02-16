package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试转换流的方式读取字符
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/collection/IteratorDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        /*
            read()方法读取一个字节，返回int表示对应的字符
         */
//        char ch = (char)isr.read();
//        System.out.println(ch);
        long start = System.currentTimeMillis();
        int d;
        while((d = isr.read()) != -1)
        {
            System.out.print((char)d);
        }
        long end = System.currentTimeMillis();
        System.out.println("\n" + (end - start) );
    }
}
