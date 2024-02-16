package homework.day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 *
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scan = new Scanner(System.in);
        System.out.println("请你输入一个文件名：");
        file = new File(scan.next());
        while(file.exists())
        {
            System.out.println("该文件存在，请重新输入：");
            file = new File(scan.next());
        }
        scan.close();
        file.createNewFile();
    }
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【在这里标注该句代码意义】
	Scanner scanner = new Scanner(System.in);

	//【在这里标注该句代码意义】
	while(true){

	}

	//【在这里标注该句代码意义】
	String fileName = scanner.nextLine();

	//【在这里标注该句代码意义】
	File file = new File(fileName);

	//【在这里标注该句代码意义】
	System.out.println("文件创建完毕!");

	//【在这里标注该句代码意义】
	System.out.println("请输入文件名:");

	//【在这里标注该句代码意义】
	file.createNewFile();

	//【在这里标注该句代码意义】
	if(file.exists()){

	}else{

	}

	//【在这里标注该句代码意义】
	System.out.println("该文件已存在，请更换名字");

	//【在这里标注该句代码意义】
	break;


 */








