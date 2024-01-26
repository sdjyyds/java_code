package ooday01;

import java.util.Arrays;

public class Car {
    private String color,brand;
    private double price;

    Car()
    {}
    public Car(String color, String brand, double price)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    void start()
    {
        System.out.println(this.color+"的"+this.brand+"的汽车"+"启动了！");
    }
    void run()
    {
        System.out.println(this.color+"的"+this.brand+"的汽车"+"跑起来了！");
    }
    void stop()
    {
        System.out.println(this.color+"的"+this.brand+"的汽车"+"停下来了！");
    }

    public static void main(String[] args) {
        Car c1 = new Car("黑","劳斯莱斯",10103213.10);
        c1.start();
        c1.run();
        c1.stop();
    }
}
interface House{
    public static final int a = 10;
    public abstract void set();
}

class BigHouse
{
    double price,longs,width,height;
    String name,color;

    public BigHouse(double price, double longs, double width, double height, String name, String color) {
        this.price = price;
        this.longs = longs;
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    House showHouse ()
    {
        House a = ()->{
            this.color = "蓝色";this.longs = 114.32;
            this.height = 132.23;this.width = 13123.11;
            this.name = "乡间小屋";this.price = 20000000.312;
        };
        return a;
    }
}
class Test
{
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr,0,arr,3,2);
        System.out.println(Arrays.toString(arr));
        int a[] = Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(a));
    }
}

class Test2
{
    public void objToInt()
    {
        Object [] obj = {0,1,2,'3','4',"5"};
        int [] ints = new int[3];
        try {
            System.arraycopy(obj, 0, ints, 0, 2);
            System.out.println(Arrays.toString(obj));
            System.out.println(Arrays.toString(ints));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public void objToString()
    {
        Object [] obj = {0,1,2,"3","4","5"};
        String [] str = new String[6];

        try {

            System.arraycopy(obj, 3, str, 0, 3);
            System.out.println(Arrays.toString(obj));
            System.out.println(Arrays.toString(str));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public void objToString2()
    {
        Object [] obj = {0,1,2,"3","4","5"};
        Object [] str = new Object[6];

        try {

            str = obj.clone();
            System.out.println(Arrays.toString(obj));
            System.out.println(Arrays.toString(str));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.objToInt();
        t2.objToString();
        t2.objToString2();
        r1 test = new r1() {
            @Override
            int getQ() {
                return 0;
            }
        };
    }
}

abstract class r1{
    int q = 10;
    abstract  int getQ();
}
