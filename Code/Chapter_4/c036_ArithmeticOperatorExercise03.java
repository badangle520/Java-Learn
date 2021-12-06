/*
 *	课堂练习题
 */
public class c036_ArithmeticOperatorExercise03{

	//编写一个main方法
	public static void main(String[] args){
	
		//1.假如假期还有59天,问: 合多少个星期零多少天
			int days = 59;
			int weeks = days / 7;
			int	leftdays = days % 7;
			System.out.println("假如假期还有59天,合" + weeks + "个星期零" + leftdays + "天");

		//2.定义一个变量保存华氏温度, 华氏温度转换为摄氏温度的公式为: 5 / 9 * (华氏温度 - 100)
		//  请求出华氏温度对应的摄氏温度[234.5]
			double F = 234.5;
			double C = 5.0 / 9 * (F - 100);
			System.out.println(C);
	}
}
 

