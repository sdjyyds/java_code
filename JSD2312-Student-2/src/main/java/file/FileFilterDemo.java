package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 */
public class FileFilterDemo {

    public static void getXMLfileAtcurrent()
    {
        File dir = new File(".");
        System.out.println(dir.getAbsoluteFile());
        //1.不是目录就返回
        if(!dir.isDirectory()) return;
        //2.创建文件过滤器，过滤文件
        File[] files = dir.listFiles(file->file.getName().toLowerCase().endsWith(".xml") & file.isFile());
        for(File i : files)
            System.out.println(i.getName());
    }
    public static void main(String[] args) {
        getXMLfileAtcurrent();
    }
}

