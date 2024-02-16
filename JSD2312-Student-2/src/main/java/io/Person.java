package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 测试将一个对象序列和反序列的操作
 * 序列化：
 * 将一个类转化为用于网络传输的字节文件，用于存储到硬盘或传输
 * 反向序列化：
 * 将一个类的字节文件转化为类
 *
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private char gender;
    private transient  String[] otherMs;
    public Person(){}

    public Person(String name, int age, char gender, String[] otherMs) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherMs = otherMs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getOtherMs() {
        return otherMs;
    }

    public void setOtherMs(String[] otherMs) {
        this.otherMs = otherMs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", otherMs=" + Arrays.toString(otherMs) +
                '}';
    }
}
