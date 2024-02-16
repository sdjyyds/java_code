package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new HashSet();
        c1.add(1231);
        c2.add(1231);
        c2.add("ios");
        c1.add("c++");
        c1.add("ios");
//        System.out.println(c1.addAll(c2));
//        System.out.println(c2.addAll(c1));
        System.out.println(c1);
        System.out.println(c2);
//        //取交集
//        c2.retainAll(c1);
//        System.out.println(c2);
        //差集操作
//        c2.removeAll(c1);
//        System.out.println(c2);
        //包含
        System.out.println(c1.containsAll(c2));
    }
}
