public class c043_LogicOperatorExercise04{

	//编写一个main方法
	public static void main(String[] args){
	
		int x = 5;				//	5 -> x
		int y = 5;				//	5 -> y
		if(x++==5 || ++y==5){	//	x=5==5为T,然后x++为6;||短路或不继续执行
			x = 11;				//	if为T,x =11;
		}
		System.out.println("x = " + x + ", y = " + y);	// x = 11, y = 5
	}

}
