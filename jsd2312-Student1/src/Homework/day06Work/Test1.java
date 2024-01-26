package Homework.day06Work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    Test1()
    {
        System.out.println("我是无参的构造函数！");
    }
    Test1(int a)
    {
        System.out.println("我是有一个参数a: " + a +" 的构造函数");
    }
    Test1(int a,int b)
    {
        System.out.println("我是有两个参数a: " + a +" b: "+ b +  " 的构造函数");
    }
    int sum(int a,int b)
    {
        return a + b;
    }
    int[] generateArray(int len)
    {
        Random ran = new Random();
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++) a[i] = ran.nextInt(100) + 1;
        return a;
    }


    /*
    1. 方法的练习：
要求：
定义say()无参无返回值方法，调用测试
定义say()有一个参无返回值方法，调用测试
定义say()有两个参无返回值的方法，调用测试
定义sum()两个参有返回值方法，调用测试
定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试*/
double[] printScores(String names[], Scanner scan)
{
    double[] scores = new double[names.length];
    double res = 0;
    for(int i = 0; i < names.length; i++)
    {
        System.out.println("请" +names[i]+"打分：");
        scores[i] = scan.nextDouble();
    }
    return scores;
}
double getScore(double[] ans)
{
    double res = 0,min = ans[0],max = ans[0];
    double esp = 1e-9;
    for(int i = 0; i < ans.length; i++)
    {
        if(ans[i] - max > esp) max = ans[i];
        if(min - ans[i] > esp) min = ans[i];
        res += ans[i];
    }
    res -= min + max;
    return res / (ans.length - 2);
}

    /*
2. 综合练习一：
需求:<<主持人大赛>>有N位评委给选手打分
选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分
要求:使用方法实现
*/
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Scanner scan = new Scanner(System.in);
        String names[] = {"中西会","陈冠希","岳云鹏","胡歌","周杰棍"};
        double[] scores = t1.printScores(names,scan);
        System.out.println("评委打分为："+ t1.getScore(scores));
        scan.close();
    }
}
