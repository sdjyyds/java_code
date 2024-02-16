package file;

import java.io.File;
import java.io.IOException;

/**
 * 测试创建文件
 */
public class NewFileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./test.txt");
        if(f1.exists()) System.out.println("存在");
        else
        {
            f1.createNewFile();
            System.out.println("创建成功！");
        }
    }
}
