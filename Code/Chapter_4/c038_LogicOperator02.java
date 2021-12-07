public class c038_LogicOperator02{

	//编写一个main方法
	public static void main(String[] args){
	
		// ||短路 或 |逻辑或 案例演示
		int age1 = 50;
		if(age1 >20 || age1 < 30){
			System.out.println("ok100");
		}

		int age2 = 50;
		if(age2 >20 | age2 < 30){
			System.out.println("ok200");
		}

		// 区别
		// ||短路, 如果第一个条件为true, 第二个条件不会判断,最终结果为true, 效率高
		// |逻辑或,如果第一个条件为true, 第二个条件仍然判断,最终结果为true, 效率低
		int a = 4 ;
		int b = 9 ;
		if( a > 1 || ++b > 4){
			System.out.println("ok300");
		}
		System.out.println("a = " + a + ", b = " + b);

		int c = 4 ;
		int d = 9 ;
		if( c > 1 | ++d > 4){
			System.out.println("ok400");
		}
		System.out.println("c = " + c + ", d = " + d);
	}
}
