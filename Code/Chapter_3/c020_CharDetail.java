public class c020_CharDetail{

	//编写一个main方法
	public static void main(String[] args){
	
		//在java中,char的本质是一个中等书,在输出时,是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);			//	a

		char c2 = 'a';
		System.out.println((int)c2);	// 输出a对应的整数97

		char c3 = '余';
		System.out.println((int)c3);

		char c4 = 20313;
		System.out.println(c4);

		System.out.println( 'a' + 10 );

		//课堂小测试
		char c5 = 'b' + 1;
		System.out.println((int)c5);	//99
		System.out.println(c5);			//c
	}
}
