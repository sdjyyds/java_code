package Homework.ooDay04;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.创建Inter的派生类，没有名字
        //2.new 一个 该派生类，向上转型
//    Inter in1 = ()->{System.out.println("showshow!");};
//    in1.show();
//    }
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Random ran = new Random();
        int x = ran.nextInt(100);
    }

    interface Inter {
        void show();
    }
}
