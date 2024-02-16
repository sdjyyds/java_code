package string;

/**
 * startsWith(String str)是否是以str开头
 * endsWith(Sting str)是否是以strs结束的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String name = "zhongxihui";
        System.out.println(name.startsWith(name));
        System.out.println(name.endsWith(name));
    }
}
