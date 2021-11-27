
P1-P16
## Java 历史
- 1995 sun 正式发布第1个Java版本
- 2009 Oracle甲骨文收购Sun
- 2011 Java 7
- 2021 Java 17 

PS：企业级别多使用Java 8或11，因为 LTS（Long Term Support）
https://www.oracle.com/java/technologies/java-se-support-roadmap.html

## Java技术体系平台
- Java SE（Standard Edition）标准版
- Java EE（Enterprise Edition）企业版
- Java ME（Micro Edition）小型版

区别？

## Java重要特点
1. Java语言是面向对象OOP（Object Oriented Programming）。
2. Java语言是健壮的；强类型机制、异常处理、垃圾的自动收集等是Java语言健壮性的重要保证。
3. Java语言是跨平台性的，即：一个编译好的.class文件可以在多个操作系统下运行，这种特性称为跨平台性。
4. Java语言是解释型的。
   解释性语言：JavaScript、PHP、Java
   编译性语言：C、C++
   区别：解释语言，编译后的代码，不能直接被计算机执行，需要解释器来执行；编译性语言，编译后的代码，可以直接被计算机执行。

## Java运行机制及运行特点
Java核心机制-Java虚拟机（JVM Java Virtual Machine）
1. JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器，包含在JDK中。
2. 对于不同的平台，有不同的虚拟机。
3. Java虚拟机机制屏蔽了底层平台运行的差别，实现了“一次编译，到处运行”

## JDK vs JRE
JDK基本介绍
1. JDK的全称（Java Development Kit，Java开发工具包）
2. JDK = JRE + Java开发工具包（java、javac、javadoc、javap等）
3. JDK是提供给Java开发人员使用的，其中包含了Java的开发工具，也包含了JRE。所以安装了JDK，就不需要安装JRE了

JRE基本介绍
1. JRE的全程（Java Runtime Environment，Java运行环境）
2. JRE = JVM + Java的核心类库（类）
3. 包括Java虚拟机（JVM Java Virtual Machine）和Java程序所需要的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可

JDK、JRE、JVM的包含关系
1. JDK = JRE + 开发工具包（java、javac、javadoc、javap等）
2. JRE = JVM + Java SE标准类库（Java核心类库）
3. JDK = JVM + Java SE标准类库 + 开发工具包
4. 如果只想运行开发好的.class文件，至需要安装JRE

## 配置环境变量 Path
- 为什么要配置环境变量 PATH
   操作系统运行Java程序时，首先会在前路径下寻找，如果找不到，则会去系统中环境变量中指定的路径下查找。如果仍未找到，此时操作系统会提示报错。所以，通过命令行在JDK安装目录下运行可以正常，但是在其他路径下运行如果未指定环境变量PATH则会报错。

- windows 10 系统配置方法
   1. 我的电脑-属性-高级系统设置-环境变量
   2. administrator的用户变量，增加 JAVA_HOME 环境变量，指向JDK的安装路径
   3. 系统变量，编辑PATH环境变量，增加 %JAVA_HOME%\bin
   4. 打开DOS命令行，任意目录下输入命令javac，如果出现javac的参数信心，则配置成功。 
   PS: "系统变量"对所有用户都生效，用途更广；“administrator的用户变量”仅对administrator用户生效。

P17-
## 编码
控制台的编码与文件的编号需保持一致, 例如:UTF-8,否则编译时会报错,有中文时要格外注意.

## 编译
javac HelloWorld.java
1. 有了java源文件,通过编译器将其编译成JVM可以识别的字节码文件
2. 在该源文件目录下,通过javac编译工具对HelloWorld.java文件进行编译
3. 如果程序没有错误,没有任何提示,但在当前目录下会出现一个HelloWorld.class文件,改文件称为字节码文件,也是可以执行的java的程序.

.java文件(源文件)通过执行javac程序编译得到.class文件(字节码文件)
.class文件(字节码文件)通过执行java程序,将字节码文件加载到JVM虚拟机中执行.

## 运行
1. 有了可执行的java程序(HelloWorld.class字节码文件)
2. 通过运行工具java.exe对字节码文件进行执行

修改后的HelloWorld.java源文件需要重新编译,生成新的class文件后,再进行执行,才能生效

## Java开发注意事项及细节
1. Java源文件以.java为扩展名。源文件的基本组成部分是类(class),如本类中的Hello类. 
2. Java应用程序的执行入口是main()方法。它有固定的书写洛式:
   public static void main (String[] args){…}
3. Java语言严格区分大小写
4. Java方法由一条条语句构成，每个语句以";"结束.
5. 大括号都是成对出现的,缺一不可.(习惯,先写{}再写代码)
6. 一个源文件中最多只能有一个public类,其它类的个数不限.
7. 如果源文件包含一个public类，则文件名必须按该类名命名！
8. 一个源文件中最多只能有一个public类,其它类的个数不限,也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法

## Java常用的转义字符
1. \t : 一个制表位,实现对其功能
2. \n : 换行符
3. \\ : 一个\
4. \" : 一个"
5. \' : 一个'
6. \r : 一个回车

## 初学Java易犯错误
1. 找不到文件
   解决方法:原文件名不存在或书写错误,或者当前路径错误

2. 主类名和文件名不一致
   解决方法:声明为public的主类应于文件名一直,否则编译失败

3. 缺少分号
   解决方法:编译失败,注意出现的行数,再到源代码中指定位置改错.

4. 常见错误总结
   学习变成最容易犯的错是语法错误(初学者).Java要求必须按照语法规则编写代码,例如:分号,大括号,引号,或者拼写单词错误,Java编译器都会报语法错误.

## 注释
1. 单行注释
   格式: //注释文字
   
2. 多行注释
   格式: /*注释文字*/
   (多行注释不允许嵌套多行注释)
   
3. 文档注释
   注释内容可以被JDK提供的工具javadoc解析,生成一套以网页文件形式提现的该程序的说明文档
   javadoc -d 完整路径 -xx -yy Hello.java 

## Java代码规范(入门级,完整可以参考阿里巴巴Java开发手册)
1. 类和方法的注释,要以javacdoc的方式来写
2. 非Javadoc的注释(单行注释或多行注释),往往是给代码的维护者看的,着重告诉读者为什么这样写,如何修改,注意什么问题等
3. 使用tab操作,实现缩进.默认整体向右边移动,或者用shift+tab整体向左移动
4. 运算符和=两边习惯性各加一个空格. 比如 2 + 3 - 5
5. 源文件使用utf-8编码
6. 行宽不要超过80个字符
7. 代码编写次行风格和行位风格
   