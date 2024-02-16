package string;

/**
 * int indexOf(String str)最开始出现的位置
 * int indexOf(String str,int fromIndx)某一位置开始检索
 * int lastIndexOf(String str)最后出现的位置
 * 检索str在字符串出现的位置
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        System.out.println(str.indexOf("in"));
        System.out.println(str.indexOf("in",3));
        System.out.println(str.indexOf("In",3));
        System.out.println(str.lastIndexOf("in"));//最后出现的位置
    }
}
