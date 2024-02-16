package homework.day03;
import java.util.*;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 *
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.reverse(list.subList(2,6));
        System.out.println(list);
    }
}

class Test4
{
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("fdfds");
        s.add("one");
        s.add("three");
        s.remove("one");
        System.out.println(s);
        Iterator<String> iterator =s.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println();

        String[] ass  = s.toArray(new String[s.size()]);
        System.out.println(Arrays.toString(ass));
    }
}