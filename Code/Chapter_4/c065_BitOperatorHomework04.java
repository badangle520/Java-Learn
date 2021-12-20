public class c065_BitOperatorHomework04{

	//编写一个main方法
	public static void main(String[] args){
	
		//	String类型转换成double类型的语句
		String str = "18.8";	//	注意字符串要可以被转换成double
		double d1 = Double.parseDouble(str);
		System.out.println(str);
		System.out.println(d1);

		//	char类型转换成String类型的语句
		char c1 = '张';
		String str2 = c1 + "";
		System.out.println(c1);
		System.out.println(str2);
	}
}
