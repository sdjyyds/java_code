package string;

/**
 *学习String
 * String内部维护的是一个char数组，是一个字符串
 * String 一旦创建就不可以修改，被final了，改变内容会创建新对象
 *
 * java对字符串有优化，存储在常量池中
 * java的jvm在堆中开辟一段常量池中，存储String 对象，对于出现同名的变量，直接指向对应已创建的字符串对象的地址
 * 落款格式：
 * @author 向加豪
 * @version 1.0  目前类的版本
 * @see java.lang.String 需要参考的类
 * @since jdk1.8//jdk版本
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";//使用某字面向量初始时该对象会存放在常量池中
        String s2 = "abc";//在常量池中重用已近创建的对象
        if(s1 == s2) System.out.println("s1 = s2,地址相同，指向同一个对象");
        String s3 = "abc";//依然重用
        String s4 = new String("abc123");//比较强制，一定会创建新对象
        String s5 = "abc123";//测试出new出来的String没有放到常量池中
        if(s4 == s5) System.out.println("s4 == s5");
        s1 += "!";
        System.out.println(s1 == s2);
        String s6 = "ab" + "c";//预编译计算,底层编译环境时会计算出可计算出的值，编译完为class文件后，jvm运行后看到的是结果”abc“,所以相等
        System.out.println(s6 == s2);
        String s7 = s2 + "!";//字符串拼接会创建新对象，未触发预编译特性
        System.out.println(s7 == s1);
    }
}
