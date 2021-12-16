public class c056_ConvertBinary{

	//编写一个main方法
	public static void main(String[] args){
	
		//	八进制转换成二进制
		//	规则: 将八进制数的每一位,转成对应的一个3位的二进制数即可
		//	0237 = 2 3 7 = 010 011 111 
		System.out.println(0237);							// 7 + 24 + 128 = 159
		System.out.println(Integer.toBinaryString(159));	// 0b010011111  
		
		//	十六进制转换成二进制
		//	规则: 将八进制数的每一位,转成对应的一个4位的二进制数即可
		//	0x23B = 2 3 B = 0010 0011 1011  
		System.out.println(0x23B);							// 11 + 48 + 512 = 571
		System.out.println(Integer.toBinaryString(571));	// 0b001000111011  
		

	}
}

