package collection;

import java.util.*;
import java.util.function.Consumer;

/**
 * jdk8之后，集合又提供了一个基于lambda的遍历表达式——foreach
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> s  = new LinkedList<>();
        s.add("中西会");
        s.add("彭楚达");
        s.add("王中王");
        s.add("WPF");
        System.out.println(s);
        for(String i : s) System.out.println(i);
       // s.forEach( i -> System.out.println(i));
        s.forEach(System.out::println);
    }
}
class Test
{
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i ++) List.add(random.nextInt(100));
        Collections.sort(List, (o1,o2)-> o1 - o2);
        List.sort((o1,o2)-> o1 - o2 );
        System.out.println(List);
        List.forEach(System.out::println);
    }
}
