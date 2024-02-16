package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("q.txt");
        byte[] bytes = new byte[input.available()];
        input.read(bytes);
        String message = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(message);
    }
}

