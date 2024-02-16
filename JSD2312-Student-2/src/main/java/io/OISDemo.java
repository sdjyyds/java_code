package io;

import java.io.*;

public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("zxh.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p1 = (Person) ois.readObject();
        System.out.println(p1);

    }
}
