package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2
{
    public static void main(String[] args) {
        List<Point> List = new ArrayList<>();
        List.add(new Point(3,4));
        List.add(new Point(5,5));
        List.add(new Point(1,-2));
        List.add(new Point(43,4));
        List.add(new Point(23,10));
        //Comparator比较构造器，这么写是为了降低侵入性
        Collections.sort(List,(Point o1,Point o2)->{
            int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return len1 - len2;
        });
        System.out.println(List);

    }
}
