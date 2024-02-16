package thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("岗亭我~");
        }

    }
}
