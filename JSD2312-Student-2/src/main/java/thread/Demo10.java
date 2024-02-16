package thread;

public class Demo10 {
    private static String name = "小米";
    private static String gender = "男";

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                    for (int i = 0; i < 8000;i++) {
                        synchronized (Demo10.class) {
                            try {
                                if ("男".equals(gender)) {
                                    name = "小红";
                                    gender = "女";
                                } else {
                                    name = "小米";
                                    gender = "男";
                                }
                                Demo10.class.notify();
                                Demo10.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                    for(int i = 0; i < 1000; i++)
                        synchronized (Demo10.class) {
                            try {
                                System.out.println(name + "#" + gender);
                                Demo10.class.notify();
                                Demo10.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            }
        ).start();

    }
}
