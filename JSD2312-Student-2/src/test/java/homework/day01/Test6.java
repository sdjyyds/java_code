package homework.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 提高题
 * 生成一个4位验证码(数字和字母的组合)
 * 然后输出到控制台并提示用户输入该验证码，只要用户输入正确(无论大小写都算)，
 * 就输出:验证码正确，否则输出:验证码错误
 *
 *
 * 验证码如何生成?
 * 思路导向填空:
 * 1:要先确定生成的内容范围(列出所有可以出现的字符):
 *
 * 2:先思考如何生成其中的一个字符呢？
 *   2.1:确定怎么保存这些可以出现的字符:
 *
 *   2.2:怎么能随机抽选一个
 *
 * 3:既然可以生成一个，如何做到生成4个或更多个?
 *
 * 4:怎么在生成这些字符的过程中将他们组成一个字符串?
 *
 * 5:获取到用户输入的字符串后怎么与之比较,要利用到哪些字符串操作?
 *
 *
 * @author Xiloer
 *
 */
public class Test6 {
    public static void main(String[] args) {
        char [] ch1 = {'2','q','9','0','s','1','5','d','7','3','y','t','8','g','l','k','j','h','n','4','6','b'};
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String yan = "" + ch1[random.nextInt(ch1.length-1)] + ch1[random.nextInt(ch1.length-1)] +
                ch1[random.nextInt(ch1.length-1)] + ch1[random.nextInt(ch1.length-1)];
        System.out.println("验证码为：" + yan);
        System.out.println("请输入验证码：");
        if(yan.equalsIgnoreCase(scan.nextLine())) System.out.println("验证码正确！");
        else System.out.println("验证码错误！");


    }
}

/*
		提示代码:
		需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
		并在注释中标注每句话的作用，

		//【在这里标注该句代码意义】
		String line = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		//【在这里标注该句代码意义】
		String code = "";

		//【在这里标注该句代码意义】
		Random random = new Random();

		//【在这里标注该句代码意义】
		for(int i=0;i<4;i++) {

		}
		//【在这里标注该句代码意义】
		char c = line.charAt(index);

		//【在这里标注该句代码意义】
		int index = random.nextInt(line.length());

		//【在这里标注该句代码意义】
		code+=c;

		//【在这里标注该句代码意义】
		System.out.println("请输入验证码:");

		//【在这里标注该句代码意义】
		Scanner scanner = new Scanner(System.in);

		//【在这里标注该句代码意义】
		if(code.equalsIgnoreCase(input)){

		}else{

		}

		//【在这里标注该句代码意义】
		System.out.println("验证成功!");

		//【在这里标注该句代码意义】
		System.out.println("验证失败!");

		//【在这里标注该句代码意义】
		String input = scanner.nextLine();

		//【在这里标注该句代码意义】
		System.out.println("验证码:"+code);
 */
