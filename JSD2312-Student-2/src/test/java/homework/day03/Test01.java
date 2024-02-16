package homework.day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 改错题
 *
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
    }
}
