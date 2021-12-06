/*
 *	面试题
 *
 */


public class c034_ArithmeticOperatorExercise01{

	//编写一个main方法
	public static void main(String[] args){
	
		int i = 1;	//	1 -> i;
		i = i++;	//	使用临时变量temp:(1)i->temp;(2)i=i+1;(3)temp->i
		System.out.println(i);	//	1

		int j = 1;	//	1 -> j;
		j = ++j;	//	使用临时变量temp:(1)j=j+1;(2)j->temp;(3)temp->j
		System.out.println(j);	//	2

	}
}

