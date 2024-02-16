package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 将中文的写入文件
 */
public class WriteStringDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("1.txt");
        FileOutputStream outputStream = new FileOutputStream("1.txt");
        String line;
        byte [] bytes = "我飞翔在乌云之中，你留在我回忆里面".getBytes(StandardCharsets.UTF_8);
        outputStream.write(bytes,0,bytes.length);
        int len = 0;
        StringBuilder newLine = new StringBuilder();
        while((len = inputStream.read(bytes)) != -1)
        {
            newLine.append(new String(bytes,StandardCharsets.UTF_8));
        }
        line = String.valueOf(newLine);
        System.out.println(newLine);
        System.out.println(line);
    }
}
