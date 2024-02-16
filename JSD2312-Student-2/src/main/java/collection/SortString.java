package collection;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        List.add("afssad");
        List.add("AQFdfsgf");
        List.add("LJDsfsds");
        List.add("Tnfdss");
        Collections.sort(List);
        System.out.println(List);

        List<String> List2 = new LinkedList<>();
        List2.add("中西会");
        List2.add("彭楚达");
        List2.add("饶正午！");
        List2.add("何超");
        Collections.sort(List2, (String o1,String o2)-> o1.length() - o2.length());
        System.out.println(List2);
    }
}
