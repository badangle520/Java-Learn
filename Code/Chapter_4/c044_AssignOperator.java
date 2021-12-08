public class c044_AssignOperator{

	//编写一个main方法
	public static void main(String[] args){
	
		int n1 = 10;
		n1 += 4;		//	n1 = n1 + 4
		System.out.println(n1);	//n1 = 14
	
		n1 /= 4;		//	n1 = n1 / 4
		System.out.println(n1);	//n1 = 3

		//复合赋值运算符会进行类型转换
		byte b = 3;
		//b = b + 2		//	编译报错,	int -> byte	
		b += 2;			//	等价于 b = (byte)(b + 2);
		b++;			//	等价于 b = (byte)(b + 1);
	}

}
