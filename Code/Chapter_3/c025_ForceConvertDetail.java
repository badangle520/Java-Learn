public class c025_ForceConvertDetail{

	//编写一个main方法
	public static void main(String[] args){
	
		//演示强制类型转换
		//强转符号只对最近的操作数有效, 往往使用小括号提升优先级
		//int x = (int)10 * 3.5 + 6 * 1.5;	//错误, double -> int

		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);

		//char类型可以保存int的常量值,但不能保存int的变量值,需要强转
		int m = 100;	//正确, int -> int
		char c1 = 100;	//正确, int -> cahr
		//char c2 = m;	//错误, int变量 -> char
		char c3 = (char)m;	//变量已强转
		System.out.println(c3);

	}
}
