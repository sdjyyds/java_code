package homework.day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 改错题
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		for(String s : c) {
			System.out.println(s);
		}
	}
}
