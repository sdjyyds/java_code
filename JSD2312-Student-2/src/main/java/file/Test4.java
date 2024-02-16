package file;

import java.io.File;

/**
 * 查询当前目录和本目录下的.xml文件,打印其的路径
 */
public class Test4 {
    public static void getAllXmlFile(File file)
    {
        if(!file.exists()) return;
        if(file.isDirectory())
        {
            File[] files = file.listFiles();
            for(File i : files) getAllXmlFile(i);
        }
        else if(file.getName().toLowerCase().endsWith(".xml"))
        {
            System.out.println(file.getName()+"   " + file.getAbsolutePath());
        }
    }
    public static void main(String[] args) {
        File file = new File(".");
        getAllXmlFile(file);

    }
}
