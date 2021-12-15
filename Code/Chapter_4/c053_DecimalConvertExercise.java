public class c053_DecimalConvertExercise{

	//编写一个main方法
	public static void main(String[] args){
	
		//	123转换成二进制
		//	次数 除数 被除数 商	余数
		//	1    2     123   61  1
		//	2	 2      61   30  1
		//	3    2	    30   15  0
		//	4    2      15    7  1
		//	5    2       7    3  1
		//	6    2       3    1  1
		//	7    2       1    0  1
		System.out.println(Integer.toBinaryString(123));	//0B1111011

		//	678转换成八进制
		//	次数 除数 被除数 商	余数
		//	1     8     678  84  6
		//	2     8      84  10  4
		//	3     8      10   1  2
		//	4     8       1   0  1 
		System.out.println(Integer.toOctalString(678));		//01246
		
		//	8912转换成十六进制
		//	次数 除数 被除数 商	 余数
		//	1     16   8912  557   0
		//	2     16    557   34  13
		//	3     16     34    2   2
		//	4     16      2    0   2   
		System.out.println(Integer.toHexString(8912));		//0x22D0
		

			


	}
}

