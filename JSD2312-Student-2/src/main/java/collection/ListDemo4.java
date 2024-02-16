package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 集合转数组
 * 类型[] ToArray(类型[])
 *
 */
public class ListDemo4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Object [] arr = list.toArray();

        String[] strings = list.toArray(new String[list.size()]);
        System.out.println("list:"+list);
        System.out.println("arr:"+Arrays.toString(arr));

        System.out.println("strings:" + Arrays.toString(strings));
        strings[1] ="哎";
        list.set(1,"wq");
        System.out.println("strings:" + Arrays.toString(strings));
        System.out.println("list:"+list);
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println();

        String[] arr1 = {"123","confuse","lesson","class"};
        System.out.println("数组："+Arrays.toString(arr1));

        List<String> list1 = Arrays.asList(arr1);
        list1.set(1,"confusion");
        System.out.println("集合："+list1);
        System.out.println("数组："+Arrays.toString(arr1));

        /*
        list1.add("我是");报错，对集合的加操作不能对数组操作
        曲线救国
        */
//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list1);

        //java支持复制集合的操作 new ArrayList<>(集合)
        //所有集合都支持初始化时传入其他集合，目的是创建集合包含其他集合元素
        List<String> list2 = new ArrayList<>(list1);
        list2.add("我是");
        System.out.println("list2:"+list2);



    }
}
