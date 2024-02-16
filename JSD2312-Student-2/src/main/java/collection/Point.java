package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * 测试集合类
 */
public class Point {
    private int x,y;
    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    public static void main(String[] args) {
        //Collection c = new ArrayList();
        //set的重复元素的判定也是根据equals方法来的
        Collection c = new HashSet();
        Point p1 = new Point(1,2);
        c.add(p1);
        c.add(new Point(3,3));
        c.add(new Point(6,4));
        c.add(new Point(8,9));
        Point p2 = new Point(1,2);
        c.add(p2);
        System.out.println(c);
        /*
        contains是根据元素的equals方法判断是否包含该元素的，
        因此对于自建对象需要自己重写equals方法才能够实现想要的效果
         */
        System.out.println("c包含p2吗：" + c.contains(p2));
        /*
            删除的元素也是根据equals方法找到对应的元素的--凡是判断元素相等的全是equals方法起作用，
            凡是输出为字符串的都是toString()方法起作用
         */
        c.remove(p2);
        System.out.println("c包含p2吗：" + c.contains(p2));
        System.out.println(c);
    }
}
