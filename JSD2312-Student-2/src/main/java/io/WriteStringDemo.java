package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文件中写入数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件中写入数据
        FileOutputStream out = new FileOutputStream("1.txt");
        //for(int i = 0; i < 26;i++) out.write(i + 97);
        for(int i = 0; i < 127; i++) out.write(i);
        out.close();
        System.out.println("写出完毕");

    }
}
