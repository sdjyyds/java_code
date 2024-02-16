package Wrapper;

/**
 * 包装类，
 * 目的：为了方便基本数据类型参与面向对象编程，让其成为”对象“在内存中
 *
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int a = 10;
        /*
            java推荐使用valueOf方法进行创建包装类Integer的-128到127以内的数类似字符串的常量池的重用，超过没有l
            装箱拆箱特性---自动装箱和拆箱
         */
        Integer b = Integer.valueOf(-129);
        Integer c = Integer.valueOf(-129);
        System.out.println(b.equals(c));
        System.out.println(b == c);
        //无特性
        Double d1 = Double.valueOf(128.128);
        Double d2 = Double.valueOf(1);
        System.out.println(d1.equals(d2));
        System.out.println(d1 == d2);

        double da = d1.doubleValue();
        byte by1 = d1.byteValue();
        System.out.println(da);
        System.out.println(by1);

    }
}
