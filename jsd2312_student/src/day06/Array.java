package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Array {
    public static int[] getArray(int len)
    {
        Random rand = new Random();
        int arr[] = new int[len+1];
        int max = arr[0] = rand.nextInt(100);
        for(int i = 1; i < len; i++)
        {
            arr[i] = rand.nextInt(100);
            if(max < arr[i] ) max = arr[i];
        }
        arr[len] = max;
        return arr;
    }

    public static void main(String[] args){
        int arr[] = getArray(10);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}

class father{
    int a;
    father()
    {
        a = 10;
        System.out.println("father a = " + a);
    }
    static{
        System.out.println("Father先生成");
    }
}
class son extends father
{
    int a;
    son()
    {
        a = 20;
        System.out.println("son a = " + a);
    }
    static {
        System.out.println("son先生成");
    }
    public static void say(){
        System.out.println("大家好，我今年19岁，我叫中西会，我是你的好朋友");
    }
    private static void say(int age,String name){
        System.out.println("大家好，我是大侠————"+name+"，今年"+age+"岁");
    }
    public static void main(String[] args) {
        say();
        say(19,"中西会");
    }
}

class getGrade{
    double[] GetGrade(Scanner scan,String ...age)
    {
        double [] grade = new double[age.length];
        for(int i = 0;i < age.length; i++)
        {
            System.out.printf("请%s评委打分： \n",age[i]);
            grade[i] = scan.nextDouble();
        }
        return grade;
    }
    public void printArrays(double arr[])
    {
        for(int i = 0; i < arr.length; ++ i)
        System.out.println(arr[i]);
    }
    public void printArrays(int arr[])
    {
        for(int i = 0; i < arr.length; ++ i)
            System.out.println(arr[i]);
    }
    public int getAllGrades(int arr[])
    {
        int sum = 0;
        int a = 0,b = 0;
        for(a = 0,b = arr.length-1;a != b;a++,b--)
            sum += arr[a] + arr[b];
        sum += arr[a];
        return sum;
    }

    public double getAllGrades(double arr[])
    {
        double sum = 0;
        int a = 0,b = 0;
        double max = arr[0],min = arr[1];
        for(a = 0,b = arr.length-1;a < b;a++,b--)
        {
            sum += arr[a] + arr[b];
            if(arr[a] > max ) max = arr[a];
            if(arr[b] > max) max = arr[b];
            if(arr[a] < min) min = arr[a];
            if(arr[b] < min) min = arr[b];
        }
        if(a == b)
        {
            sum += arr[a];
            if(arr[a] > max) max = arr[a];
            if(arr[a] < min) min = arr[a];
        }
        sum -= (max + min);
        return sum/(arr.length-2);
    }
    public static void main(String[] args) {
        getGrade g1 = new getGrade();
        Scanner scan = new Scanner(System.in);
        double []grade = g1.GetGrade(scan,"撒贝宁","中西会","老牌子","彭楚达","饶正午");
        g1.printArrays(grade);
        System.out.println("平均分数为："+g1.getAllGrades(grade));
    }
}