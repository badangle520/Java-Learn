public class c051_ConvertToDecimalExercise{

	//编写一个main方法
	public static void main(String[] args){
	
		//	0b110001100 转换成十进制
		//	0b:二进制
		//	110001100 = 4 + 8 + 128 + 256  
		System.out.println(0b110001100);	//	396
		
		//	02456 转换成十进制
		//	0:代表八进制
		//	2456 = 6 + 40 + 256 + 1024
		System.out.println(02456);			//	1326
		
		//	0xA45 转换成十进制
		//	0x:代表16进制
		//	A45 = 5 + 64 + 2560
		System.out.println(0xA45);			//	2629
	}

}
