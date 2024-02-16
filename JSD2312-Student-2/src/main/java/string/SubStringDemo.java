package string;

/**
 * 截取字符串，留头不留尾
 * String subString(int start,int end)
 * String subString(int start)
 * 下标开始和结束，以及从开始一直截取到末尾
 */
public class SubStringDemo {
    public static void main(String[] args) {
        String str = "fsdfsfsdf 354 343 ";
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,7));
    }
}
