package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection 集合
 * 集合存储的是对象的引用而不是具体的对象
 * Collection<E>泛型
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<Point> c = new ArrayList<>();
        Point p1 = new Point(1,2);
        c.add(p1);
        System.out.println(p1);
        System.out.println(c);

        p1.setY(100);

        System.out.println(p1);
        System.out.println(c);
    }
}
