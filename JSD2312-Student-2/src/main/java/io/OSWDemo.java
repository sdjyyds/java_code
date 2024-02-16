package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 转换流，充当字符流和字节流之间的转换流
 * 一个OutputStream,InputStream(字节流超类),一个是字符流和字节流的转化流
 * OutputStreamWriter  InputStreamReader
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("0.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("我们的爱情到这刚刚好~");
        osw.close();
    }
}
