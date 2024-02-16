package file;

import java.io.File;

/**
 * 测试删除文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists())
        {
            file.delete();
            System.out.println("删除文件成功");
        }
        else System.out.println("不存在该文件");
    }
}
