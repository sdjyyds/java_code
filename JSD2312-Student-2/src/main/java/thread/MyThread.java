package thread;

public class MyThread extends Thread{
    String name;
    public MyThread(String name)
    {
        this.name = name;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(this.name + "线程在跑……");
        }
    }
}
