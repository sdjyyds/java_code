package string;

/**
 * 课堂练习：实现getHostName()方法得到域名
 *
 */
public class Test {
    public String getHostName(String url)
    {
        int idx1 = url.indexOf(".") + 1;
        int idx2 = url.indexOf(".",idx1);
        return url.substring(idx1,idx2);
    }

    public static void main(String[] args) {
        String str1 = "https://ww.baidu.com";
        Test t = new Test();
        System.out.println(str1 +"的域名是："+t.getHostName(str1));
    }
}
