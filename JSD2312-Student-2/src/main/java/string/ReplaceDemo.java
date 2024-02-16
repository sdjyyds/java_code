package string;

import java.util.Arrays;

/**
 * 将匹配为regex的内容替换为replacement
 * String replaceAll(String regex,String replacement)
 */
public class ReplaceDemo {
    public static void main(String[] args) {
        String message = "你个fw,我nm,回家找个班上,nt";
        String regex = "(fw|nm|fuck|md|nmd|nt)";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
        int a[] ={43,4324,21,123};
        System.out.println(Arrays.toString(a));
    }
}
