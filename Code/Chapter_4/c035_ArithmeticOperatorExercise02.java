public class c035_ArithmeticOperatorExercise02{

	//编写一个main方法
	public static void main(String[] args){
	
		int i1 = 10;	//	i1 = 10
		int i2 = 20;	//	i2 = 20
		int i = i1++;	//	i = i1; i1 = i1 +1 ;
		System.out.println("i = " + i);		//	10
		System.out.println("i2 = " + i2);	//	20

		i = --i2;		//	i2 = i2 - 1; i = i2
		System.out.println("i = " + i);		//	19
		System.out.println("i2 = " + i2);	//	19
	}
}
