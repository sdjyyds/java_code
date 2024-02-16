package collection.test;

import collection.Point;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        String s = "hello";
        int a = 1;
        Point p = new Point(1,2);
        Collection c = new ArrayList();
        c.add(p);
        test(s,a,p,c);
        System.out.println("s:"+s);//?
        System.out.println("a:"+a);//?
        System.out.println("p:"+p);//?
        System.out.println("c:"+c);//?
    }
    public static void test(String s, int a, Point p, Collection c) {
        a++;
        s = s + "world";
        p.setX(3);
        p = new Point(4,5);
        c.clear();
        c.add(p);
        c = new ArrayList();
        p.setX(7);
        c.add(p);
    }
}