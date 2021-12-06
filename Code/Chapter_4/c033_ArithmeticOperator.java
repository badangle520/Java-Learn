/**
 *	演示算数运算符的使用
 *
 */


public class c033_ArithmeticOperator{

	//编写一个main方法
	public static void main(String[] args){
	
		// / 除法
		//从数学来看是2.5, java中10和4的精度都是整数,所以结果精度也是整数,即2
		System.out.println(10/4);

		//从数学来看是2.5, java中10.0精度较高(double),所以结果精度也是double,即2.5
		System.out.println(10.0/4);

		//Java 中10 / 4 = 2, 2->double, 所以结果是2.0
		double i = 10 / 4;
		System.out.println(i);

		// % 取模, 求余
		// 在 % 的本质 看一个公式 a % b = a - a / b * b 
		
		//  10 % 3 = 10 - (10) / 3 * 3 = 10 - 3 * 3 = 10 - 9 = 1
		System.out.println( 10 %  3);	//  1

		// -10 % 3 = -10 - (-10) / 3 * 3 = -10 - (-3) * 3 = -10 + 9 = -1
		System.out.println(-10 %  3);	// -1

		// 10 % -1 = 10 - 10 / (-3) * (-3) = 10 - (-3) * (-3) =10 - 9
		System.out.println( 10 % -3);	//  1
		
		// -10 % -1 = -10 - (-10) / (-3) * (-3) = -10 - 3 * (-3) = -10 + 9 = -1 
		System.out.println(-10 % -3);	// -1
	
		// ++ 自增,
		// 独自使用
		int a = 10;
		System.out.println("a = " + a);	
		a++;	//自增,等价于 a = a + 1;
		System.out.println("a++ = " + a);	

		int b = 10;
		System.out.println("b = " + b);	
		++b;	//自增,等价于 b = b + 1;
		System.out.println("++b = " + b);	
	
	
		int c = 10;
		System.out.println("c = " + c);	
		c++;	//自增,等价于 c = c + 1;
		System.out.println("c++ = " + c);	
		++c;	//自增,等价于 c = c + 1;
		System.out.println("++c = " + c);	

		/*
		 *	作为表达式使用,
		 *	前++: ++i, 先自增后赋值
		 *	后++: i++, 先赋值后自增
		 */
		int d = 10;
		System.out.println("d = " + d);
		int e = ++d;	//	d = d + 1; e = d;
		System.out.println("++d = " + d);
		System.out.println("e = " + e);

		int f = 10;
		System.out.println("f = " + f);
		int g = f++;	//	g = f ; f = f++;
		System.out.println("g = " + g);
		System.out.println("f++ = " + f);
	}
}
