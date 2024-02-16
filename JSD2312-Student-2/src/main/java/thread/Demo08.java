package thread;

public class Demo08 {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(3);
                    sb.append("fass");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(3);
                    sb.append("aaaa");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(10000);
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
