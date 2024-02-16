package collection.test;

import java.util.LinkedList;
import java.util.List;

/**
 * List是可重复元素集合，List提供了一系列方法来获取下标
 * java.util.ArrayList 采用数组的方式进行存储，地址连续，查找快
 * java.util.LinkedList 采用链表的方式进行存储，首尾存储快，查询慢
 * e get(int index)
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("33");
        list.add("ipad");
        list.add("computer");
        list.add("windows");
        list.add("ios");
        System.out.println(list);
        //list方法 E get(int index)
        System.out.println(list.get(1));
        //E set(int index, E e) 将index位置的参数置为e,并返回原来位置上的值
        //反转位置
        for(int i = 0; i < list.size() / 2 ; i++)
        {
            String old = list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,old);
        }
        System.out.println(list);


        //E remove(int index) 删除指定位置的元素，并返回值
        String s1 = list.remove(3);
        System.out.println(list);
    }
}
