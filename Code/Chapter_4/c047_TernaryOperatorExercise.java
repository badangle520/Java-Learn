public class c047_TernaryOperatorExercise{

	//编写一个main方法
	public static void main(String[] args){
	
		//实现三个数的最大值
		int a = 1;
		int b = 2;
		int c = 3;
		int max = a > b ? ( a > c ? a : c ) : (b > c ? b : c) ;
		System.out.println(max);

		int max1 = a > b ? a : b;
		int max2 = c > max1 ? c : max1;
		System.out.println(max2);

		int max3 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max3);

	}

}
