public class c041_LogicOperatorExercise02{

	//编写一个main方法
	public static void main(String[] args){
	
		int x = 5;				//	5 -> x
		int y = 5;				//	5 -> y
		if(x++==6 && ++y==6){	//	x=5<6为F,然后x++为6;&&短路与,不继续执行;
			x = 11;				//	if为F,x =6;
		}
		System.out.println("x = " + x + ", y = " + y);	// x = 6, y = 5
	}

}
