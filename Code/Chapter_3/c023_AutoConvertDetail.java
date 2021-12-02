//自动类型转换细节
public class c023_AutoConvertDetail{

	//编写一个main方法
	public static void main(String[] args){
		//细节1: 有多种类型的数据混合运算时,
		//系统首先自动将所有数据转换成容量最大的那种数据类型,然后再进行计算
		int n1 = 10;			// 正确, int -> int
		//float d1 = n1 + 1.1;	// 错误, double -> float
		//double d1 = n1 + 1.1; // 正确, double -> double
	    float d1 = n1 + 1.1F;	// 正确, float->float

		//细节2: 当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时,
		//就会报错, 反之就会进行自动类型装换
		//
		//int n2 = 1.1;			//错误, double->int
		
		//细节3: (byte,short) 和char 之间不会互相自动转换
		//(1)当把具体数赋给 byte时, 先判断该数是否在byte范围内, 如果在就可以
		//(2)当吧变量赋值给 byte时, 先判断数据类型
		byte b1 = 10;			//正确, -128 ~ 127
		// int n2 = 1;			//正确, int -> int
		// byte b2 = n2;		//错误, int -> byte
		//
		//char c1 = b1;			//错误, byte -> char
		
		//细节4: byte, short, char 他们三者可以计算, 在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;		//错误, b2 + s1 -> int, int -> short
		int s2 = b2 + s1;			//正确, b2 + s1 -> int, int -> int
	
		//boolean 不参与转换
		boolean pass = true;
		//int num100 = pass;		//错误, boolean 不参与类型的转换
		
		//自动提升原则: 表达结果的类型自动提成为 操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		float num400 = 1.2F;
		
		double numb500 = b4 + s3 + num200 + num300;	//正确, double -> double
		//int numb600 = b4 + s3 + num200 + num400;	//错误, float -> int


	}
}
