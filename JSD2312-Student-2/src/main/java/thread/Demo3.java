package thread;

import org.junit.Test;

public class Demo3 {
    @Test
    public void test01() {
        System.out.println("fdsfds");
    }

    public static void main(String[] args) {
        //test02();
        test03();
    }

    /**
     * 守护线程
     */
    public static void test03() {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("主线程在执行……");
                Thread.sleep(3000);
                System.out.println("主线程运行结束");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("守护线程在执行……");
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }

    /**
     * 测试Runnable 和 Thread ,以及Thread.sleep()和Thread.currentThread()方法
     */
    public static void test02() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread t1 = Thread.currentThread();
                    t1.setName("李四");
                    t1.setPriority(10);
                    System.out.println(t1 + t1.getName() + t1.getId());
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread t1 = Thread.currentThread();
                    t1.setName("张三");
                    System.out.println(t1 + t1.getName() + t1.getId());
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        System.out.println(Thread.currentThread());
        while (true) {
            System.out.println(t1.getName() + t1.isAlive());
        }
    }
}
