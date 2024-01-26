package ooday01;

public class Student {
    String name;
    int age;
    String className;
    int stuId;
    void study()
    {
        System.out.println(name + "正在学习!");
    }
    void say()
    {
        System.out.println("Hello ,I'm"+name+" I'm glad to see you !");
    }
    void play(Student friend)
    {
        System.out.println("I'm play with " + friend.name + "!");
    }
}


