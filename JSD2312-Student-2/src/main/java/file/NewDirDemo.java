package file;

import java.io.File;

/**
 * 创建目录
 */
public class NewDirDemo {
    public static void main(String[] args) {
        File file = new File("a/v/c/q");
        if(file.exists()) System.out.println("目录已存在");
        else {
            file.mkdirs();
            System.out.println("创建目录成功！");
        }
    }
}
