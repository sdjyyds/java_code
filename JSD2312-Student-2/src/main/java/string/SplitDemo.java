package string;

import java.util.Arrays;

/**
 * 将str匹配的regexp的部分删除并分割，以数组的形式返回,末尾拆出空串会舍弃
 * String[] split(String regexp)
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "afafsfogk24432404vdfd.43635";
        String [] s = str.split("[0-9]+");
        System.out.println(Arrays.toString(s));
        //末尾舍弃，中间保留
        str = "fsfs+=fsdf=+++++++fd.++++";
        s = str.split("\\+");
        System.out.println(Arrays.toString(s));
    }
}
