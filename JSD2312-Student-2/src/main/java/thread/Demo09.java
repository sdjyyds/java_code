package thread;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * 遇到集合的问题就采用线程同步
 * Collections.响应的synchronized方法将其转换为线程安全的集合对象
 */
public class Demo09 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> l = new LinkedList<>();
        List<Integer> list = Collections.synchronizedList(l);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000;i++)
                {
                    try {
                        Thread.sleep(3);
                        list.add(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(3);
                        list.add(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(7000);
        System.out.println(list.size());
    }
}
