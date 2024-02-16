package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 演示集合的构造器
 * 得到对应集合的构造器
 * public iterator iterator<E>();
 * java.util.Iterator接口，迭代器接口
 *
 * 问->取
 *
 * 删
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add(" ");
        c.add("java");
        c.add("!");
        Iterator iterator = c.iterator();
        while(iterator.hasNext())
        {
            String e = (String)iterator.next();
            /*
                迭代器要求：使用时不能使用集合增删元素，会造成并发问题
             */
            if(" ".equals(e))
                iterator.remove();
//                c.remove(e);
            System.out.printf(e);
        }
        System.out.println(c);
    }
}
