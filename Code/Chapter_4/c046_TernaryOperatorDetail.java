public class c046_TernaryOperatorDetail{

	//编写一个main方法
	public static void main(String[] args){
	
		//表达式1和表达式2要为可以赋给接受变量的类型(或可以自动转换)
		int a = 3;
		int b = 8;
		//int c = a > b ? 1.1 : 3.5;			//报错,double->int
		int c = a > b ? a : b ;
		System.out.println("c = " + c);		//	8

		int d = a > b ? (int)1.1 : (int)3.5 ;
		System.out.println("d = " + d);		//	double -> int, 3.5 -> 3
		
		double e = a > b ? a : b + 3 ;
		System.out.println("e = " + e);		//	11.0

	}

}
