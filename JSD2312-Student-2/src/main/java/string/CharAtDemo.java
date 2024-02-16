package string;

/**
 * char CharAteDemo(int index);
 * 返回 字符串指定下标位置下的字符
 */
public class CharAtDemo {
    public static boolean judgeString(String str)
    {
        boolean flag = true;
        for(int i = 0; i < str.length() / 2; i++)
        {
            char a = str.charAt(i),b = str.charAt(str.length()- 1 - i);
            if(a != b)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String str = "fcfadfsqwre ds ";
        char index = str.charAt(3);
        System.out.println(index);
        String str1 = "adcf ecda";
        System.out.println(CharAtDemo.judgeString(str1));
    }
}
