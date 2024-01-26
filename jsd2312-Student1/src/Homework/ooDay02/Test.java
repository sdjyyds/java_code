package Homework.ooDay02;

import ooday01.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    /*
    1. Person、Student、Teacher、Doctor类和Test类
Person类：name、age、address、Person(参)、eat()、sleep()，sayHi()
Student类：继承Person、className、stuId，Student(参)、study()，重写sayHi()方法
Teacher类：继承Person、salary，Teacher(参)、teach()，重写sayHi()方法
Doctor类：继承Person、title，Doctor(参)、cut()
Test：创建对象、调用方法测试
2. Animal、Dog、Chick、Fish和AnimalTest类
Animal类：name、age、color、Animal(参)、drink()、eat()
Dog类：继承Animal，重写eat()、lookHome()
Chick类：继承Animal，重写eat()、layEggs()
Fish类：继承Animal，重写eat()
AnimalTest：创建3个Dog对象、3个Chick对象、2个Fish对象，并测试
     */
}
class Person {
    String name,address;
    int age;
    Person(){}
    Person(String name,String address,int age)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("person");
    }
    void eat()
    {
        System.out.println("person : "+this.name+"正在吃饭！");
    }
    void sleep()
    {
        System.out.println("person : "+this.name+"正在睡觉！");
    }
    void sayHi()
    {
        System.out.println("person : "+this.name+"跟你说你好！");
    }
}
class Student extends Person{
    String stuId;
    Student(String name,String address,int age,String stuId)
    {
        super(name,address,age);
        this.stuId = stuId;
    }
    void study()
    {
        System.out.println(this.name+"正在学习！");
    }

    @Override
    void sayHi() {
        System.out.println("Student: "+this.name+"正在和你打招呼");
    }
}

class Teacher extends Person
{
    String salary;
    Teacher(String name,String address,int age,String salary)
    {
        super(name, address, age);
        this.salary = salary;
    }
    void teach(){
        System.out.println("Teacher: "+this.name+"老师正在教孩子们知识！");
    }
    void sayHi() {
        System.out.println("Teacher: 同学们好！");
    }
}

class Doctor extends Person
{
    String titile;
    Doctor(String name,String address,int age,String title)
    {
        super(name, address, age);
        this.titile = title;
    }
    void cut()
    {
        System.out.println("docter: "+this.name+"正在给病人做手术！");
    }
}

class Animal{
    String name,color;
    int age;
    Animal(String name,String color,int age)
    {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    void drink()
    {
        System.out.println("animal : "+this.name+"正在喝水");
    }
    void eat()
    {
        System.out.println("animal : "+this.name+"正在觅食");
    }
}

class dog extends Animal{
    dog(String name,String color,int age)
    {
        super(name, color, age);
    }
   void lookHome()
    {
        System.out.println("dog: "  +this.name +"正在帮你看家！");
    }
    @Override
    void eat() {
        System.out.println("dog: "+this.name+"正在吃si！");
    }
}

class Chick extends Animal{
    Chick(String name,String color,int age)
    {
        super(name, color, age);
    }

    @Override
    void eat() {
        System.out.println("chick: "+this.name+"正在吃东西！");
    }
    void layAggs()
    {
        System.out.println("chick: "+this.name + "正在下蛋！");
    }
}

class fish extends Animal{
    fish(String name,String color,int age)
    {
        super(name, color, age);
    }

    @Override
    void eat() {
        System.out.println("fish: "+this.name+"正在吃水！");
    }
}

class A{
    String name,age;
    A(String name,String age)
    {
        this.name = name;
        this.age = age;
    }
    final void print()
    {
        System.out.println(this.name);
    }
}

class B extends A{
    static int  a = 10;
    B(String name,String age)
    {
        super(name,age);
    }
    public static void main(String[] args) {
        //System.out.println(B.a);
//        final int a1 = 10;
//        //a1++;
//        ArrayList<String> a = new ArrayList<>();
//        a.add("132");
//        a.add("123");
//        a.add("12243");
//        Collections.sort(a);
        Car c = new Car("黑色","玛莎拉蒂",1313123.213);
    }
}
