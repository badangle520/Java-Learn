import java.util.Scanner;	//表示把包java.util下的类Scanner导入

public class c048_Input{

	//编写一个main方法
	public static void main(String[] args){
		//演示接受用户的输入
		//步骤
		//Scanner类 表示 简单文本扫描器, 在java.util包
		//1. 引入/导入 Scanner类所在的包
		//2. 创建 Scanner 对象, new 创建一个对象,myScanner就是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);		//	System.in表示从键盘输入

		//3. 接收用户的输入
		System.out.println("请输入名字");
		String name =  myScanner.next();	//接收用户输入字符串
		System.out.println("请输入年龄");
		int age =  myScanner.nextInt();	//接收用户输入int
		System.out.println("请输入薪水");
		double sal  =  myScanner.nextDouble();	//接收用户输入double
		System.out.println("人的信息如下:");
		System.out.println("name = " + name + " age = " + age + " sal = " + sal);
	}
}
