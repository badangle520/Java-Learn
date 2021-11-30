public class c018_FloatDetail{

	//编写一个main方法
	public static void main(String[] args){
	
		//Java的浮点常量型(具体值)默认为double型,声明float型常量, 需要后面加 f 或 F
		//float num1 = 1.1;		//错误,double型转换到float型,精度损失
		float num1 = 1.1F;		//正确
		double num3 = 1.2;		//正确
		double num4 = 1.3F;		//正确

		//十进制形式: 例如: 5.12	512.0f	.512	(必须有小数点)
		double num5 = .123;		//等价于0.123
		System.out.println(num5);

		//科学计数法形式: 例如: 5.12e2 []		5.12E-2[]
		System.out.println(5.12e2);
		System.out.println(5.12E2);
		System.out.println(5.12e-2);
		System.out.println(5.12E-2);

		//通常情况下,应该使用double型,因为它比float型更精确
		//[举例说明]
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);

		//浮点数使用陷阱: 2.7 和 8.1 /3 比较
		double num11 = 2.7;		// 2.7
		double num12 = 8.1 / 3;	// 接近2.7的一个小数,而不是2.7,计算机把8.1看成是8.10000001
		System.out.println(num11);
		System.out.println(num12);
		//得到一个重要的结论点,当我们对运算结果是小数的进行相等判断,判断时要小心
		//应该是以两个数的差值的绝对值, 在某个精度范围内判断
		if( num11 == num12){
			System.out.println("相等");
		}
		//正确的写法		
		System.out.println(Math.abs(num11 - num12));
		if(Math.abs( num11 - num12 ) < 0.001){
			System.out.println("差值非常小, 到我的规定精度, 认为相等");
		}
	}
}
