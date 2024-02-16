package io.test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 用来复习JavaIO对对象流的理解
 */
public class TestStuOBJ {
    static void doSerialize(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream("stu1.obj");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(student);
        oos.close();
    }

    static Student dodeSerialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Student student = null;
        try{
            fis = new FileInputStream("stu1.obj");
            ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();
            ois.close();
            return student;
        }catch (IOException | ClassNotFoundException e){System.out.println(e.getMessage());}
        finally {
            if(ois != null) {
                ois.close();
            }
        }
        return null;
    }

    /**
     * 一个一个读
     * @throws IOException
     * @throws FileNotFoundException
     */
    static void ISR1() throws IOException,FileNotFoundException {
        FileInputStream fis = new FileInputStream("q.txt");
        int d,idx = 0;
        StringBuilder url = new StringBuilder();
        byte[] bytes = new byte[1024];
        while( (d = fis.read()) != -1)
        {
            bytes[idx] = (byte)d;
            if(++idx == 1024)
            {
                url.append(new String(bytes,0,idx,StandardCharsets.UTF_8));
                idx = 0;
            }
        }
        if(idx != 0) url.append(new String(bytes,0,idx,StandardCharsets.UTF_8));
        System.out.println(url);
        fis.close();
    }
    static void readFIS2() throws IOException {
        FileInputStream fis = new FileInputStream("q.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len;
        byte[] bytes = new byte [1024 * 8];
        while((len = bis.read(bytes)) != -1)
        {
            System.out.println(new String(bytes,0,len,StandardCharsets.UTF_8));
        }
        bis.close();
    }
    static void writeFOS1() throws IOException {
        FileOutputStream fos = new FileOutputStream("q.txt",true);
        String str = "I'm a big dog,what about yuo ? \n";
        fos.write(str.getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
    static void writeFOS2() throws IOException {
        FileOutputStream fos = new FileOutputStream("q.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "I'm a small mouse,I like eat milk.What about you ? \n";
        bos.write(str.getBytes(StandardCharsets.UTF_8));
        bos.close();
    }
    /*
    字符流,java.io.Writer,java.io.Reader
    转换流, ReaderInputStream   WriterOutputStream
    字节缓冲流 BufferedInputStream BufferedOutputStream，字符缓冲流 BufferedWriter BufferedReader
    新合流 快速完成多重的加工，直接方便读取字符 PrintWriter
     */
    static void inputStreamReader() throws IOException {
        FileInputStream fis = new FileInputStream("q.txt");
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        int d;
        while( (d = isr.read()) != -1) {
            System.out.print((char)d);
        }
        int len;
        char[] ch = new char[1024 * 4];
        while( (len = isr.read(ch)) != -1)
        {
            System.out.println(ch);
        }
        isr.close();
    }
    static void outputStreamWriter() throws IOException {
        FileOutputStream fos = new FileOutputStream("q.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        String str = "I'd like snake.\n";
        osw.append(str);
        osw.close();
    }
    static void bufferedReader() throws IOException {
        FileInputStream fis = new FileInputStream("q.txt");
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        char ch[] = new char[1024 * 8];
        int len;
        StringBuilder sb = new StringBuilder();
        while((len = br.read(ch)) != -1)
        {
            sb.append(ch,0,len);
        }
        System.out.println(sb);
        br.close();
    }
    static void bufferedWriter() throws IOException {
        FileOutputStream fis = new FileOutputStream("q.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fis,StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        String str = "wa,so beautiful! \n";
        bw.write(str);
        bw.close();
    }
    static void printWriter() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("q.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("春天来了，夏天还会远吗？");
        pw.print("应该不远了……");
        pw.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("202241903306","中西会","1312443243");
        doSerialize(student);
        System.out.println(dodeSerialize());
        File file = new File("q.txt");
        if(!file.exists()) file.createNewFile();
        ISR1();
        readFIS2();
        writeFOS1();
        ISR1();
        writeFOS2();
        ISR1();
        inputStreamReader();
        outputStreamWriter();
        bufferedReader();
        bufferedWriter();
        printWriter();
        ISR1();
        file.delete();
    }
}
