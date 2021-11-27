public class c008_Homework004{
	public static void main(String[] args){
		System.out.println("环境变量path配置及其作用");
		System.out.println("为了在任意路径下可以直接使用java和javac命令及其他命令;");
		System.out.println("树莓派可以进入以下路径进行设置:");
		System.out.println("vim /etc/environment (系统级环境变量，先读取)");
		System.out.println("vim /etc/profile (用户级环境变量，后读取)");
		System.out.println("增加以下部分");
		System.out.println("JAVA_HOME=\"/usr/lib/jvm/java-1.8.0-openjdk-armhf/bin/java\"");

	}
}
