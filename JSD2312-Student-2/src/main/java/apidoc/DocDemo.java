package apidoc;

/**
 * 文档注释，功能性作业，用来说明一个类，方法或常量的功能
 * 文档注释可被javadoc提供的命令生成手册
 * 格式：
 * @author 向加豪
 * @version 1.0  目前类的版本
 * @see java.lang.String 需要参考的类
 * @since jdk1.8//jdk版本
 *
 */
public class DocDemo {

    /**
     * sayHello中的问候语
     */
    public static final String NiNice ="你好：";
    /**
     * 为用户添加问候语
     * @param name 给定用户名
     * @return 返回String 类型的 问候语
     */
    public String sayHello(String name)
    {
        return NiNice+name;
    }
}
