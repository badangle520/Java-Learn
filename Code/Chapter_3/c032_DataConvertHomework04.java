public class c032_DataConvertHomework04{

	//编写一个main方法
	public static void main(String[] args){
		String book1 = "水浒传";
		String book2 = "红楼梦";
		System.out.println(book1 + book2);		// "水浒传红楼梦"

		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2);			// 先提升为int型,然后进行加法运算
		
		double p1 = 123.56;
		double p2 = 100.11;
		System.out.println(p1 + p2);			// 直接数字进行运算

	}
}
