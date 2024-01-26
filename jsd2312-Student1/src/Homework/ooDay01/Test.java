package Homework.ooDay01;

public class Test {

    public static void main(String[] args) {
        Student stu1 = new Student("中西会","湖南农业大学东科院","202241903306");
        stu1.study();
        stu1.playWith("蔡徐坤");
        Car c1 = new Car("劳斯莱斯","黑色",101483024.3213);
        c1.start();
        c1.run();
        c1.stop();
    }

}
class Student
{
    String name,className,stuId;
    int age;
    Student(String name,String className,String stuId)
    {
        this.age = age;
        this.className = className;
        this.stuId = stuId;
        this.age = age;
        this.name = name;
    }
    void study()
    {
        System.out.println(this.name +"正在学习！");
    }
    void playWith(String anotherName)
    {
        System.out.println(this.name +"正在和"+anotherName+"一起玩耍！");
    }
}

class Car{
    String brand,color;
    double price;
    Car(String brand,String color,double price)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    void start()
    {
        System.out.println(this.brand +"品牌的"+this.color+"的汽车已启动！");
    }
    void run()
    {
        System.out.println(this.brand +"品牌的"+this.color+"的汽车正在跑！");
    }
    void stop()
    {
        System.out.println(this.brand +"品牌的"+this.color+"的汽车已停下！");
    }

}