public class c037_LogicOperator01{

	//编写一个main方法
	public static void main(String[] args){
	
		//	&& 案例演示
		int age1 = 50;
		if(age1 > 20 && age1 < 90){
			System.out.println("ok100");
		}		
		
		//	& 案例演示
		int age2 = 50;
		if(age2 > 20 && age2 < 30){
			System.out.println("ok200");
		}

		//	区别
		//	对于&&短路而言, 如果第一个条件为false, 后面的条件不会判断,结果为false,效率高
		int a = 4;
		int b = 9;
		if(a  < 1  && ++b < 50){
			System.out.println("ok300");
		}		
			System.out.println("a = " + a + ", b = " + b);

		//	对于&逻辑与而言, 如果第一个条件为false, 后面的条件仍然判断,结果为false,效率低
		int c = 4;
		int d = 9;
		if(c  < 1  & ++d < 50){
			System.out.println("ok300");
		}		
			System.out.println("c = " + c + ", d = " + d);

	}
}
