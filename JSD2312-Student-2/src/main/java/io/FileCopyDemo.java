package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 将一个图片复制到另一个地方去
 *
 * */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //1.先加载输入输出流
        //2.读写数据
        FileInputStream input = new FileInputStream("1.png");
        FileOutputStream out = new FileOutputStream("a.png");
        byte[] bytes = new byte[1024];
        int len;
        while( (len = input.read(bytes)) != -1)//一次读取多个字节，返回读入个数
        {
            out.write(bytes,0,len);//一次写出到a.png多个字节
        }
        input.close();
        out.close();
    }
}
