package file;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File file = new File(".");
        if(file.isDirectory())
        {
            File[] f = file.listFiles();
            System.out.println("删除目录成功！");
        }
        else
        {
            System.out.println("不是目录！");
        }
    }
}
