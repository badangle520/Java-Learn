public class c015_VarDetail{
	
	//编写一个main方法
	public static void main(String[] args){
		//变量必须先声明, 后使用, 即有顺序
		int a = 50;
		System.out.println(a);
		
		//该区域的数据的值可以在同一类型范围内不短变化	
		//a = "jack";
		a = 88;
		System.out.println(a);

		//变量在同一个作用域内不能重名
		//int a = 77; // 错误
	}
}

class c015_Dog{
	public static void main(String[] args){
		int a = 666; // 对
	}
}
