/**
 *演示字符串转基本数据类型的细节
 *
 */

public class c028_StringToBasicDetail{

	//编写一个main方法
	public static void main(String[] args){
	
		String str1 = "123";
		String str2 = "hello";

		//转成int
		int n1 = Integer.parseInt(str1);
		System.out.println(n1);

		int n2 = Integer.parseInt(str2);
		System.out.println(n2);
	}
}
