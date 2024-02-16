package collection;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("abvsd");
        c.add("中西会");
        c.add("刘帅");
        c.add("王无!");
        c.add("王中王");
        if(c instanceof List)  Collections.sort(c,(o1,o2)->o1.length()-o2.length());
        System.out.println(c);
    }
}
