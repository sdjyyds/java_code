package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * IOException
 */
public class IOException extends Throwable {

    static void doWrite1()
    {
        FileOutputStream fos = null;
        try {
            //编译阶段就可以检查出的异常为检查异常
            fos = new FileOutputStream("./aaa/10.txt", true);
            fos.write("Hello".getBytes(StandardCharsets.UTF_8));
            fos.close();
        }
        catch (FileNotFoundException | NullPointerException e)
        {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        catch (java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
        //把释放资源的事情都放在finally中
        finally {
            if(fos != null) {
                try {
                    fos.close();
                    System.out.println("关闭成功");
                } catch (java.io.IOException e) {
                    System.out.println("关闭失败"+e.getMessage());
                }
            }
        }
    }

    static void doWrite2()
    {

        try(FileOutputStream fos = new FileOutputStream("./aaa/10.txt", true)) {
            //编译阶段就可以检查出的异常为检查异常
            fos.write("Hello".getBytes(StandardCharsets.UTF_8));
        }
        catch (FileNotFoundException | NullPointerException e)
        {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        catch (java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        doWrite2();
    }
}
