package file;
import java.io.File;

/**
 * 思考:删除当前项目目录下的a目录
 */
public class Test3 {
    public static void main(String[] args) {
        File dir = new File("a");
        delete(dir);
    }
    /**递归删除指定目录下的所有目录和文件*/
    public static void delete(File f){
        if(f.exists()&&f.isDirectory()){
            File[] files = f.listFiles();
            for(File subFile:files){
                if(subFile.isDirectory()){
                    delete(subFile);//递归调用
                }else{
                    subFile.delete();
                }
            }
        }
        f.delete();
    }
}
