package io;

import java.io.*;

public class RegDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String userName = "中西会";
//        String userPassword = "zxh666";
//        char gender = '男';
//        int age = 20;
//        User u1 = new User(userName,userPassword,age,gender);
        User u1 =InputUtil.getInputObject(new User());
        FileOutputStream fos = new FileOutputStream(u1.getUserName()+".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u1);

        FileInputStream fis = new FileInputStream(u1.getUserName() +".obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User u = (User)ois.readObject();
        System.out.println(u);
    }
}
