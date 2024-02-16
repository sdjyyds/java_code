package homework.day01;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        String name = "向加豪";
        System.out.println(name);
        System.out.println(judgeUserName(name,".{1,20}"));
    }

    /**
     * 比较用户名的合法性
     * @param userName 传入用户名
     * @param regex 传入比较的规则
     * @return  返回判断结果
     */
    public static boolean judgeUserName(String userName,String regex)
    {
        boolean flag = false;
        flag = userName.matches(regex);
        return flag;
    }
}
