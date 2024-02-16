package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 新的循环，Java1.5推出的，为了解决数组和集合遍历不一致的情况
 * for(变量名：数组或集合){}
 *新循环时编译器认可的，不是jvm认可的
 * 如果新for循环是集合，则编译器会将成改为迭代器
 * 如果是数组，就是普通循环，如果想要对集合删操作，就要使用迭代器，没有提供增元素的操作
 *
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[0] = "one";
        arr[4] = "four";
        arr[6] = "six";

        for(int i = 0; i < arr.length; i ++)
            System.out.printf(arr[i] + " ");

        System.out.println();
        for(String i : arr)
            System.out.printf(i + " ");

        Collection<String> c = new ArrayList<>();
        c.add("one");c.add("two");c.add("three");c.add("four");c.add("five");
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext())
        {
            String e = iterator.next();
            System.out.printf(e + " ");
        }
        System.out.println();
        for(String i : c)
            System.out.printf(i + " ");
    }
}
