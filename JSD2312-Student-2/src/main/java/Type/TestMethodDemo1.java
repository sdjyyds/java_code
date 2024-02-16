package Type;

import java.util.*;

/**
 * 测试方法的泛型的使用，一般情况为想使用什么就返回什么
 *静态方法不能用类上的范型，因为加载的优先级问题
 */
public class TestMethodDemo1 <T>
{
   public<E>  E dosome(E a)
   {
       return a;
   }
//   public static T get(T e){ return null;   #不行，因为加载优先级的问题
    public static <Q> Q get(Q e){return null;}
}
class Demo
{
    public static void main(String[] args) {
        TestMethodDemo1 t1 = new TestMethodDemo1();
        Integer[] a = {1,23,32,53};
        System.out.println(Arrays.toString(a));
        List<Integer> c = Arrays.asList(a);
        System.out.println(c);
    }
}
