package homework.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 拆分字符串练习
 *
 * 背景介绍:
 * 上网的时候,浏览器地址栏上有没有留意类似如下的地址形式?
 * https://search.jd.com/Search?keyword=usb&enc=utf-8&wq=usb&pvid=2fb014e3597c4712828926e2f35fa2b5
 *
 * 上面这样的地址称为:URL(什么是URL可以百度一下~)
 *
 * SE后期我们要写一个服务端,就要处理浏览器这样的请求.今天学习的字符串拆分方法在这里意义重大!
 *
 *
 * 单词记一记:
 * path   路径
 * age    年龄
 * local  本地的
 * host   计算机中译为:主机，服务机
 * nickname 昵称
 *
 * reg 是单词register的前三个字母，是注册的意思。
 * @author Xiloer
 *
 */
public class Test2 {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan";
        /*
         * 将上述字符串按照"?"拆分为两部分并输出
         * ?左侧在控制台输出内容为:
         * 请求:http://localhost:8088/myweb/reg
         *
         * ?右侧在控制台输出内容为:
         * 参数:name=zhangsan
         *
         */
        String [] str= path.split("\\?");
        System.out.println(Arrays.toString(str));
        int start = 0,end = 0;
        for(int i = 1; i < str.length; i++)
        {
            while(end < str[i].length())
            {
                end = str[i].indexOf("&",start);
                if(end == -1) end = str[i].length();
                String type = str[i].substring(start,end);
                int fen = type.indexOf("=");
                System.out.println(type.substring(0,fen));
                System.out.println(type.substring(fen+1,type.length()));
                start = end + 1;
            }
        }
        /*
         * 进一步练习:
         */
        //           请求部分                                     ?                 参数部分
        path = "http://localhost:8088/myweb/reg?name=zhangsan&pwd=123456&nick=san&age=16";
        /*
         * 先拆分出请求部分与参数部分
         *
         * 观察参数部分的格式，找出规律后再将每一个参数的名字和值
         * 得到并输出为:
         * 参数名:name,参数值:zhangsan
         * 参数名:pwd,参数值:123456
         * ...
         */


    }
}
