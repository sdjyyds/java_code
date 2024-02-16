package file;

import java.io.File;

/**
 * 将当前项目目录下的test1.txt--test100.txt删除
 */
public class Test2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 200; i ++)
        {
            File file = new File("test"+i+".txt");
            if(file.exists())
            {
                file.delete();
                System.out.println("删除"+file.getName()+"成功！");
            }
            else System.out.println("该文件不存在！");
        }
    }
}
