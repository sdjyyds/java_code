package Homework.ooDay05;

class Test {
    /*
    1. 完成Point类，演示访问控制修饰符的用法
     */
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.a ++;
        p1.b ++;
        p1.c ++;
        //p1.d ++;
    }
}
public class Point{
    public int a;
    protected int b;
    int c;
    private int d;
    void show()
    {
        a++;
        b++;
        c++;
        d++;
    }
}
class StaticTest{
    int a;
    static int c;
    StaticTest()
    {
        c = 10;
        a = 10;
    }
    static{
        c = 10;
    }
    static void show()
    {
        //a = 10;无构建的this.
        c = 10;//StaticTest.c
    }
    void shows()
    {
        a = 10;//this.a
        c = 10;//StaticTest.c
    }
}


