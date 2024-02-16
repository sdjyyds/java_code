package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectInputStream and java.io.ObjectOutputStream
 * 对象流就是一组高级流，在流连接里进行对象的序列化和反序列化
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "中西会";
        int age = 20;
        char gender = '男';
        String [] otherMe = {"扣鼻","抄作业","打游戏","学Java","学算法"};
        Person person1 = new Person(name,age,gender,otherMe);
        FileOutputStream fop = new FileOutputStream("zxh.obj");
        ObjectOutputStream objFop = new ObjectOutputStream(fop);
        objFop.writeObject(person1);
        objFop.close();
    }
}
