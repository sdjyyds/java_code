package thread;

public class Demo5 {
    private static String name = "张三";
    private static String gender = "男";

    public static void main(String[] args) {
        //1.修改线程
        new Thread(()->{
            while(true)
            {
                synchronized (Demo5.class) {
                    if(gender == "男")
                    {
                        name = "小红";
                        gender = "女";
                    }
                    else
                    {
                        name = "张三";
                        gender = "男";
                    }
                }
            }
        }).start();

        //2.打印线程
        new Thread(()->{
            while (true) {
                synchronized (Demo5.class) {
                    System.out.println(name +"---" + gender);
                }
            }
        }).start();
    }
}
