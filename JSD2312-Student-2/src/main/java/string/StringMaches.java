package string;

/**
 * 利用regexp中的正则表达式规则匹配，成功返回true
 * boolean matches(String regexp)
 */
public class StringMaches {
    public static void main(String[] args) {
        /*
        用户名@域名.com.cn
        [0-9a-zA-Z_]+@[0-9a-zA-Z]+(\.[a-z0-9A-Z]+)+

        \\\\

         */
        String email = "3402243478@qq.com";
        String regexp = "[0-9a-zA-Z_]+@[0-9a-zA-Z]+(\\.[a-z0-9A-Z]+)+";
        System.out.println(email.matches(regexp));
    }
}
