package Wrapper;

/**
 * 每个包装类都提供了对应的最大值和最小值
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int max1 = Integer.MAX_VALUE;
        int min1 = Integer.MIN_VALUE;
        System.out.println(max1);
        System.out.println(min1);
        byte minb = Byte.MAX_VALUE;
        byte maxb = Byte.MIN_VALUE;
        System.out.println(minb);
        System.out.println(maxb);
        double d1 = Double.MAX_VALUE;
        System.out.println(d1);
        String str ="123.123";
        /*
            java的包装类的parse(解析)严苛，不能够转不是对应的类型，报java.lang.NumberFormatException
         */
        //int a = Integer.parseInt(str);报错
        double b = Double.parseDouble(str);
        System.out.println(b);
        int a = 10;
        //触发自动装箱功能,Integer.valueOf(a)
        Integer I1 = a;
        //触发自动拆箱功能,a.intValue()
        a = I1;

    }
}
