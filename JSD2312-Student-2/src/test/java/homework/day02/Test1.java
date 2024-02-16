package homework.day02;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 *
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 *
 *
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 *
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 * @author Xiloer
 *
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();
        String regexUser = "[0-9a-zA-Z_]{3,15}";
        String regexAge  = "[0-9]+";
        run(p1,scan,regexUser,regexAge);
        System.out.println(p1);
    }
    public static boolean judge(String judgeMessage,String regex)
    {
        boolean flag = false;
        flag = judgeMessage.matches(regex);
        return flag;
    }
    public static void run(Person person,Scanner scan,String regexUser,String regexAge)
    {
        boolean flag = true;
        boolean flag2 = true;
        while(flag)
        {
            System.out.println("请输入用户名：");
            String userName = scan.nextLine();
            if (judge(userName, regexUser))
            {
                flag = false;
                while(flag2)
                {
                    person.setName(userName);
                    System.out.println("请输入年龄：");
                    String age = scan.nextLine();
                    int num = Integer.parseInt(age);
                    if (judge(age, regexAge) && num >= 1 && num <= 100)
                    {
                            person.setAge(age);
                            flag2 = false;
                    }
                    else System.out.println("年龄有误！");
                }
            }
            else System.out.println("用户名有误");
        }
    }
}

class Person{
    private String name,age;
    public Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}