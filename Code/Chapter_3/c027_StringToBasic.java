public class c027_StringToBasic{

	//编写一个main方法
	public static void main(String[] args){
	
		//基本数据类型->String
		
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 +  "";
		String s2 = f1 +  "";
		String s3 = d1 +  "";
		String s4 = b1 +  "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 );

		//String -> 对应的基本数据类型;
		String s5 = "123";
		// 会在讲对象和方法的时候回详细解读
		// // 使用基本数据类型对用的包装类, 的相应方法, 得到基本数据类型
		byte  num1 = Byte.parseByte(s5);
		short num2 = Short.parseShort(s5);
		int   num3 = Integer.parseInt(s5);
		long  num4 = Long.parseLong(s5);
		float num5 = Float.parseFloat(s5);
		double num6 = Double.parseDouble(s5);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);

		//怎么吧字符串转成字符char -> 含义是指 把字符串的第一个字符得到
		//解读 s5.charAt(0) 得到 s5字符串的第一个字符'1'
		System.out.println(s5.charAt(1));
	}
}
