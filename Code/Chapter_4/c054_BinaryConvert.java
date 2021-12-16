public class c054_BinaryConvert{

	//编写一个main方法
	public static void main(String[] args){
	
		//	二进制转换成八进制
		//	规则: 从低位开始, 将二进制每三位一组, 转成对应的八进制数字即可
		//	0b11010101转换成八进制 1+ 4 + 16 + 64 + 128 = 213
		//	11 010 101 = 3 2 5   
		System.out.println(0b11010101);					// 1+ 4 + 16 + 64 + 128 = 213
		System.out.println(Integer.toOctalString(213));	// 0325
		
		//	二进制转换成十六进制
		//	规则: 从低位开始, 将二进制每四位一组, 转成对应的十六进制数字即可
		//	0b11010101转换成十六进制 1+ 4 + 16 + 64 + 128 = 213
		//	1101 0101 = D 5   
		System.out.println(0b11010101);					// 1+ 4 + 16 + 64 + 128 = 213
		System.out.println(Integer.toHexString(213));	// 0xD5

			


	}
}

