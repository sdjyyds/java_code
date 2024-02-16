package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection 集合
 * 用来描述集合的。各种数据结构
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("fad");
        System.out.println("是否存入成功："+c.add(1));//触发装箱特性，里面是object的参数
        System.out.println("是否存入成功："+c.add(1));//触发装箱特性，里面是object的参数
        System.out.println(c);
        System.out.println("c.size："+c.size());
        System.out.println("c是否为空集："+c.isEmpty());
        System.out.println("c size："+c.size());
        c.clear();
        System.out.println("c是否为空集："+c.isEmpty());
        System.out.println("c size："+c.size());
    }
}
