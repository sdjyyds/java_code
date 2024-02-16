package string;

import java.util.Scanner;

/**
 * 转化为全大写或小写
 * String ToUpperCase();
 * String ToLowerCase();
 */
public class ToUpperlowDemo {
    public static void main(String[] args) {
        String str = "你好，HEllo";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        Scanner scan = new Scanner(System.in);
        String code = "aFd1";
        String input = scan.next();
        code = code.toLowerCase();
        input = input.toLowerCase();
        //System.out.println(code.equals(input));
        //java提供了忽略大小写的判断
        System.out.println(code.equalsIgnoreCase(input));
    }
}
