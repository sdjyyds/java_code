package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./Demo.txt");
        //单位字节
        long len = file.length();
        System.out.println(len);
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
    }
}
