public class c045_TernaryOperator{

	//编写一个main方法
	public static void main(String[] args){

		// int result1 = a > b ? a++ : b --; 等价于
		// if(a > b) result1 = a++;else result1 = --b;	
		int a = 10;
		int b = 99;
		int result1 = a > b ? a++ : b --;	//	10>99为F,执行b--,即将b->result,然后b=b-1
		System.out.println("result1 = " + result1);		//	99
		System.out.println("b = " + b);					//	98


		int c = 20;
		int d = 80;
		int result2 = c < d ? c++ : d--;
		System.out.println("result2 = " + result2);		//	20
		System.out.println("c = " + c);					//	21
		System.out.println("d = " + d);					//	80

	}

}
