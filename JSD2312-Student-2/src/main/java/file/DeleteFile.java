package file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("a/v/c");
        if(file.exists())
        {
            file.delete();
            System.out.println("删除目录已成功");
        }
        else System.out.println("目录不存在！");
    }
}
