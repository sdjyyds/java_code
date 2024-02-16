package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字节流的问题
 *
 */
public class BosFlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("box.txt");
        BufferedOutputStream bufOutput = new BufferedOutputStream(output);
        String str = "错过了你就像错过这世界耶";
        bufOutput.write(str.getBytes(StandardCharsets.UTF_8));
        bufOutput.close();
    }
}
