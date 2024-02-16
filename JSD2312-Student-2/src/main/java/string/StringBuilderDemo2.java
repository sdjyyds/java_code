package string;

/**
 * 演示StringBuilder的性能--于String拼接字符串的差距
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("a");
        for(int i = 0; i < 1000000;i++)
            strb.append("a");
        System.out.println("执行完毕");
    }
}
