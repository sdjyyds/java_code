package homework.day03;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        //生成10个0-100之间的不重复的随机数,并输出
        Random random = new Random();
        Collection<Integer> list = new HashSet<>();
        while(list.size() < 10)
            list.add(random.nextInt(100));
        System.out.println(list);
    }
}
