package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("2.txt");
        String u = "I Love Java\n";
        byte[] bytes = u.getBytes(StandardCharsets.UTF_8);
        out.write(bytes);
        bytes = "Thanks ".getBytes(StandardCharsets.UTF_8);
        out.write(bytes);
        out.close();
    }
}
