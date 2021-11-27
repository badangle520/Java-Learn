public class c002_ChangeChar{
	public static void main(String[] args){
//      \t : 一个制表位,实现对其功能
		System.out.println("t : 一个制表位,实现对其功能");
		System.out.println("北京\t上海\t广州\t深圳");
//      \n : 换行符
		System.out.println("n : 换行符");
		System.out.println("北京\n上海\n广州\n深圳");
//      \\ : 一个\
		System.out.println("\\\\: 两个斜线");
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		System.out.println("\\\\\\\\: 四个斜线");
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
//      \" : 一个"
		System.out.println("\" : 一个双引号");
		System.out.println("老师说:\"好好学习,天天向上!\"");
//      \' : 一个'
		System.out.println("' : 一个单引号");
		System.out.println("老师说:\'好好学习,天天向上!\'");
//      \r : 一个回车
//      解读
//      1. 输出 好好学习
//      2. \r表示回车, 光标定位当前行的首位
//      3. 输出 深圳
		System.out.println("r : 一个回车");
		System.out.println("好好学习\r深圳");
		System.out.println("r : 一个回车, n : 换行符");
		System.out.println("好好学习\r\n深圳");
		System.out.println("好好学习\n\r深圳");
	}
}
