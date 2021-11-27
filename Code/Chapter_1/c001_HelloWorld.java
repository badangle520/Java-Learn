
//这是Java的快速入门，演示Java的开发步骤
//对代码的相关说明
//1. public class HelloWorld 表示HelloWorld是一个类, 是一个public公有的类
//2. HelloWorld{ }表示一个类的开始和结束
//3. public static void mian(String[] args)表示主方法,即我们程序的入口
//4. main() {} 表示方法的开始和结束
//5. System.out.println("Hello World!")表示输出"Hello World!"到屏幕
//6. ;表示语句结束

public class c001_HelloWorld
{
	//编写一个main方法
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}

//一个源文件中最多只能有一个public类,其他类的个数不限.
//Dog是一个类
//编译后,每一个类,都对应一个.class字节码文件

class c001_Dog
{
//一个源文件中最多只能有一个public类,其它类的个数不限,也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法
	 public static void main(String[] args)
	 {
	 	System.out.println("Hello, 小狗!");
	 }

}

class c001_Triger
{
	public static void main(String[] args)
	{
		System.out.println("Hello, 小老虎!");
	}
}
