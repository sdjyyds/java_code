package io;

import java.io.*;

public class OutputDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("666.txt");
        /*
        write只写低8位
         */
        out.write(1);
        out.write(2);
        out.write(300);
        out.close();

        FileInputStream input = new FileInputStream("666.txt");
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        input.close();
    }
}
