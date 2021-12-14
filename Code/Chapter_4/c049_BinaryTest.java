//演示四种禁止
//
public class c049_BinaryTest{

	//编写一个main方法
	public static void main(String[] args){

		//	二进制(Binary):0 1; 满2进1; 以0b或0B开头
		//	八进制(Octal):0-7; 满8进1; 以数字0开头
		//	十进制(Decimal):0-9; 满10进1;
		//	十六进制(Hexdecimal):0-9及A(10)-F(15),以0x或0X开头
		
		//	n1 二进制
		int n1 = 0b1010;
		//	n2 十进制
		int n2 = 1010;
		//	n3 八进制
		int n3 = 01010;
		//	n4 十六进制
		int n4 = 0X10101;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
	}
}
