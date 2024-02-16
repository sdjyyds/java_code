package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前项目目录下创建100个文件，名字为test1.txt--test100.txt
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        for(int i = 101; i <= 200;i++)
        {
            File file = new File("test"+i+".txt");
            if(file.exists()) System.out.println("目录已存在");
            else
            {
                file.createNewFile();
                System.out.println("创建目录成功");
            }
        }
    }
}
