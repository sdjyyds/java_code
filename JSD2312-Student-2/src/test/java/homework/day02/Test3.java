package homework.day02;
import java.util.Scanner;

/**
 * 执行程序，分析并解决问题
 * @author Xiloer
 *
 */
public class Test3 {
    public static void main(String[] args) {
        String path1 = "/myweb/reg";//处理注册的路径
        String path2 = "/myweb/login";//处理登录的路径
        /*
         * 程序启动后，输入上述两个地址后检查下面输出.
         * 分析并解决存在的问题，并写出错误原因:
         *path 创建新的String对象，始终都是与path1和path2地址不相等（==号比较地址）
         *因为不是采用字面量进行的String对象的构建，于是不会涉及到常量池
         *应该改为equals比较
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地址:");
        String path = scanner.nextLine();
        if(path!=null) {
            if(path1.equals(path)) {
                System.out.println("处理注册!");
            }else if(path2.equals(path)) {
                System.out.println("处理登录!");
            }else {
                System.out.println("输入地址有误!");
            }
        }
    }
}
