package thread;

/**
 * 模拟做菜
 * 爸爸买锅，弟弟买菜，姐姐买调料
 */
public class Demo11 {
    public static final int COUNT = 3;
    static int idx;
    public static void main(String[] args) {
        new Thread(new Person("弟弟", "菜", 2000)).start();
        new Thread(new Person("姐姐", "调料", 4000)).start();
        new Thread(new Person("爸爸", "锅", 5000)).start();
        synchronized (Demo11.class) {
            while(idx < COUNT)
            {
                try {
                    Demo11.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("材料集齐了，妈妈开始做饭了");
        }
    }
}

class Person implements Runnable {
    private String name, someThing;
    private int payTime;

    public Person() {
    }

    public Person(String name, String someThing, int payTime) {
        this.name = name;
        this.someThing = someThing;
        this.payTime = payTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            System.out.println(this.name + "买" + this.someThing + "去咯");
            Thread.sleep(payTime);
            System.out.println(this.name + "回来咯");
            synchronized (Demo11.class) {
                Demo11.class.notify();
                Demo11.idx++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}