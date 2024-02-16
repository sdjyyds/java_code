package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List subList(int start,int end) 方法获取指定下标位置的元素
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 9; i ++)
            list.add(i);

        System.out.println("list:" + list);
        /*
            对子集的操作会影响原集
         */
        List<Integer> subList = list.subList(2,8);
        for(int i = 0; i < subList.size();i++)
            subList.set(i,subList.get(i) * 10);

        System.out.println("list:" + list);
        System.out.println("subList:" + subList);

        List<Integer> subList2 = list.subList(1,9);
        subList2.clear();
        System.out.println(list);
    }
}
