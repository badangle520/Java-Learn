public class c057_ConvertBinaryExercise{

	//编写一个main方法
	public static void main(String[] args){
	
		//	八进制转换成二进制
		//	01230 = 1230 = 001 010 011 000
		System.out.println(01230);							// 24 + 128 + 512 = 664
		System.out.println(Integer.toBinaryString(664));	// 0b001010011000  
		
		//	十六进制转换成二进制
		//	0xAB29 = A B 2 9 = 1010 1011 0010 1001  
		System.out.println(0xAB29);							// 9 + 32 + 2816 + 40960 = 43817
		System.out.println(Integer.toBinaryString(43817));	// 0b1010101100101001 
	}
}

