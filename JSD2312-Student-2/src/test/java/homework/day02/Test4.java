package homework.day02;
/**
 * 执行程序，分析并解决问题
 *
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 *
 *
 * @author Xiloer
 *
 */
public class Test4 {
    public static void main(String[] args) {
        /*
         * 原因:parseInt严格要求传入的String必须为Int,而num带来空格
         */
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);

//        /*
//         * 原因:parseInt并不会进行类型的强制转化，所以报错，应该对应的改为double的解析或直接num="int类型"
//         */
//        num = "123.456";
//        d = Integer.parseInt(num);
//        System.out.println(num);

        /*
         * 原因:成功
         */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);
    }
}
