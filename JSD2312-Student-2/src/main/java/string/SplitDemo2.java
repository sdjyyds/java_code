package string;

import java.util.Arrays;

/**
 * 重载split方法，对拆分个数做出限制
 * String[] split(String regexp,int limit)
 */
public class SplitDemo2 {
    public static void main(String[] args) {
        String str = "fsdf+ +++++++dsa++dad+++da+++++=fsdf++";
        String[] s = str.split("\\+",5);
        System.out.println(Arrays.toString(s));

        s = str.split("\\+",50);
        System.out.println(Arrays.toString(s));
        s = str.split("\\+",0);//相当于split(String regex)
        System.out.println(Arrays.toString(s));
        s = str.split("\\+",-1);//拆尽
        System.out.println(Arrays.toString(s));
    }
}
