package thread;

public class Demo1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.start();
        MyThread02 thread3 = new MyThread02();
        thread3.start();
        new Thread() {
            public void run() {
                while (true) {
                    System.out.println("亲爱的，你慢慢飞~");
                }
            }
        }.start();
        Thread thread5 = new Thread(new MyRunnable());
        thread5.start();
        Thread thread6 = new Thread(new MyRunnable02());
        thread6.start();
        Thread thread7 = new Thread(() -> {
            while (true) {
                System.out.println("我起飞咯~");
            }
        });
        thread7.start();
    }
}
