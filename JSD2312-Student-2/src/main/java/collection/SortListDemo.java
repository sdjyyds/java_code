package collection;

import java.util.*;

/**
 * Collection的静态方法实现排序，也可以使用Array的静态方法排序
 *
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int []a = new int[10];
        for(int i = 0; i < 10; i++)
        {
           a[i] =  random.nextInt(100);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        List<Integer> col1 = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            col1.add(random.nextInt(100));
        Collections.sort(col1);
        System.out.println(col1);

        List<Integer> col2 = new LinkedList<>();
        for(int i = 0; i < 10; i++)
            col2.add(random.nextInt(100));
        Collections.sort(col2);
        System.out.println(col2);

        Set<Integer> s1 = new HashSet<>();
        for(int i = 0; i < 10; i++)
            s1.add(random.nextInt(100));
        System.out.println(s1);
    }
}
