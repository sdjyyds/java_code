package Homework.day04Work;

import java.util.Random;
import java.util.Scanner;

public class DefineV {
    public static void main(String[] args) {
        //int a;
        Integer a = 10;//赋值，自动装箱——将基本数据类型转化为Integer对象
        Integer b = 10;//引用同一片空间——装箱函数Valueof在-127-128中引用同一个存在的对象
        Integer f = 20;
        Integer c = 211;
        Integer d = 211;//赋值，不同的引用对象
        Integer e = 422;
        long q1 = 1;
        Integer q2 = 1;
        System.out.println(c == d);//比较地址
        System.out.println(a==b);//比较地址
        System.out.println(a.equals(b));//比较值自动拆箱
        System.out.println(c.equals(d));//比较值自动拆箱
        System.out.println(a + b == f);//出现运算符号，自动拆箱为int，比较值
        System.out.println(f.equals(a+b));//比较值。自动拆箱
        System.out.println(q2.equals(q1));//equals方法不会进行类型转化，自动拆箱
    }
}

class test1
{
    public static void main(String[] args) {
        int [] a = new int[100000];
        long startTime=System.currentTimeMillis(); //获取开始时间
        for(int i = 0; i <= 100000; i++) {
            try {
                System.out.print(a[i]);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        //毫秒ms
        //要测的程序或方法
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
}

class Day04Work {
    static Scanner scan;
    static Random ran = new Random();
    /*
    生成菜单选项,1测试switch,2猜随机数while，3do……while来实现猜数，4输出“行动是成功的阶梯”
    5，输出99乘法表，累加1到100的和
     */
    void menu() {
        System.out.println("********************************************************************");
        System.out.println("           *********1.测试switch********");
        System.out.println("         ***********2.猜随机数1************");
        System.out.println("       *************3.猜随机数2**************");
        System.out.println("     ***************4.输出行动是成功的阶梯************");
        System.out.println("   *****************5.99乘法表***************************");
        System.out.println(" *******************6.累加1到100的和****************************");
        System.out.println("********************************************************************");
        System.out.println("   **********************************************");
        System.out.println("   *****************请输入你的选择：***************");
        int choose = scan.nextInt();
        start(choose);
    }
    void start(int choose)
    {
        boolean continue1 = false;
        switch (choose)
        {
            case 1:
                test1();
                break;
            case 2:
                test2();
                break;
            case 3:
                test3();
                break;
            case 4:
                test4();
                break;
            case 5:
                test5();
                break;
            case 6:
                test6();
                break;
        }
        System.out.println("请输入是否继续：1表示继续：");
        if(scan.nextInt() == 1) menu();
    }
    private void test1()
    {
        System.out.println("请输入测试数：");
        int a = scan.nextInt();
        switch (a)
        {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            default:
                System.out.println("程序结束了！");
        }
    }
    private void test2()
   {
       int ranx = ran.nextInt(10) + 1;
       while(true)
       {
           System.out.println("请输入猜的数的大小：");
           int x = scan.nextInt();
           if(x == ranx){
               System.out.println("恭喜你！猜对了；");
               break;
           }else if( x > ranx){
               System.out.println("猜大了！");
           }else{
               System.out.println("猜小了！");
           }
       }
   }
    private void test3()
   {
       int ranx = ran.nextInt(10) + 1;
       do
       {
           System.out.println("请输入猜的数的大小：");
           int x = scan.nextInt();
           if(x == ranx){
               System.out.println("恭喜你！猜对了；");
               break;
           }else if( x > ranx){
               System.out.println("猜大了！");
           }else{
               System.out.println("猜小了！");
           }
       }while (true);
   }
    private void test4()
   {
       for(int i = 0; i < 4; ++ i)
       {
           System.out.println("行动是成功的阶梯！");
       }
   }
    private void test5()
   {
       for(int i = 1; i < 10;  ++i) {
           for (int j = 1; j <= i; ++j) {
               System.out.print(i + " * " + j + " = " + i * j + "  ");
           }
           System.out.println();
       }
   }
   private void test6()
    {
        int res = 0;
        for(int i = 1; i <= 100; i++)  res += i;
        System.out.println(res);
    }
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Day04Work test = new Day04Work();
        test.menu();
        scan.close();
    }
}

class Day04Extend{
    /*
    1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
    2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
    3. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
     */
    //1
    void getFu(int a)
    {
        if(a == 0) System.out.println("0");
        else if(a > 0) System.out.println("+");
        else System.out.println("-");
    }
    void getDay(int year,int month)
    {
        int yearDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) yearDays[1]++;
        System.out.println(year+"年-"+month+"月: 一共有"+yearDays[month-1]+".");
    }
    void printRunNian(int starty,int endy)
    {
        while(starty <= endy)
        {
            if(starty % 4 == 0 && starty % 100 != 0 || starty % 400 == 0)
                System.out.println(starty);
            starty++;
        }
    }

    public static void main(String[] args) {
        Day04Work.scan = new Scanner(System.in);
        Day04Extend test = new Day04Extend();
        System.out.println("请输入测试数：");
        test.getFu(Day04Work.scan.nextInt());
        System.out.println("请输入年月计算天数");
        test.getDay(Day04Work.scan.nextInt(),Day04Work.scan.nextInt());
        System.out.println("请输入起始年份和结束年份");
        test.printRunNian(Day04Work.scan.nextInt(),Day04Work.scan.nextInt());
        Day04Work.scan.close();
    }
}