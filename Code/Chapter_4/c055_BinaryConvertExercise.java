public class c055_BinaryConvertExercise{

	//编写一个main方法
	public static void main(String[] args){
	
		//	二进制转换成八进制
		//	0b11100101 = 11 100 101 = 3 4 5   
		System.out.println(0b11100101);					// 1+ 4 + 32 + 64 + 128 = 229
		System.out.println(Integer.toOctalString(229));	// 0345
		
		//	二进制转换成十六进制
		//	0b1110010110 = 11 1001 0110 = 3 9 6     
		System.out.println(0b1110010110);				// 2 + 4 + 16 + 128 + 256 + 512 = 918
		System.out.println(Integer.toHexString(918));	// 0x396

			


	}
}

