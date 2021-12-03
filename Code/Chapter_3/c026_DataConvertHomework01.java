public class c026_DataConvertHomework01{

	//编写一个main方法
	public static void main(String[] args){
	
		//判断是否能够通过编译
		
		// short s = 12;	//错误, 先判断数值范伟
		// s = s - 9;		//错误, int -> short

		// byte b = 10;		//可以, byte首先判断是否可以容纳10
		// b = b + 11;		//错误, int -> byte
		// b = byte(b+11)	//可以, 使用强转
		
		// char c = 'a';	//可以
		// int i = 16;		//可以
		// float d = .314F	//可以
		// double result = c + i + d;	//可以, float -> double
		
		// byte b = 16;		//可以
		// short s = 14;	//可以, 先判断数值范围
		// short t = s + b;	//错误, 自动提升成int类型
	}
}
