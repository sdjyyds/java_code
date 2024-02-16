package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 做一个简易记事本
 * 在控制台输入的信息全部录入到文件中，如果输入“exit”,推出程序，最后读出里面的内容，输出到控制台，
 */
public class workDemo1 {
    static String inputToFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream, Scanner scan) throws IOException {
        String str = "";
        System.out.println("请输入：");
        while(! (str = scan.next()).equals("exit"))
        {
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            System.out.println("请输入：");
        }
        byte [] bytes =  new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        str = new String(bytes,StandardCharsets.UTF_8);
        return str;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner scan = new Scanner(System.in);
        String message = inputToFile(fileInputStream,fileOutputStream,scan);
        System.out.println("file name is " + file.getName());
        System.out.println(message);
    }
}
