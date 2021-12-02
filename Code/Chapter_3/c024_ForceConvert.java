public class c024_ForceConvert{

	//编写一个main方法
	public static void main(String[] args){
	
		int i = (int)1.9;
		System.out.println(i);		//错误, 造成精度损失

		int j = 100;
		byte b1 = (byte)j;
		System.out.println(b1);		//正确

		int k = 2000;
		byte b2 = (byte)k;
		System.out.println(b2);		//错误, 造成数据溢出

	}
}
