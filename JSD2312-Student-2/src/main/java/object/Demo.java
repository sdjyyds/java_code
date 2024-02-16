package object;

/**
 * 测试Point类
 * object的toString默认将类转化为object.类型@地址的方式输出
 */
public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        System.out.println(p1);
        Point p2 = new Point(1,3);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
