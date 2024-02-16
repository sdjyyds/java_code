package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 读取当前文件中所有内容
 */
public class InputDemo2 {
    static String getAllFileMessage(FileInputStream fileInputStream,int len) throws IOException {
        byte[] bytes = new byte[len];
        fileInputStream.read(bytes);

        return  new String(bytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/collection/CollectionDemo1.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        String message = getAllFileMessage(fileInputStream,(int)file.length());
        System.out.println(message);
    }
}
