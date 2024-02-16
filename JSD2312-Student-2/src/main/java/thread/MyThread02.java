package thread;


public class MyThread02 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("现在的时间为：" + System.currentTimeMillis());
        }
    }
}
