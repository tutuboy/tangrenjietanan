package test;

public class Testtype {

	/**
	 输出班里最高分，姓名，性别
	 */
	public static void main(String[] args) {
		/*
		 在java中数据类型有8种，如下；
		 整数类型：byte,short,int,long.
		浮点类型：float,double.
		字符型：char
		布尔类型：boolean
		还有引用类型：string
		
		变量名的命名规则；
		1。变量名由字母，数字，下划线，美元符号组成
		2.变量名不能以数字开始
		3.变量中间不能有空格、
		4。不能使用java中的关键字
		5.简明知意
		6.首字母小写，如果有两个单词第二个字母大写
		
		main方法中声明的变量只能在局部使用
		 */
		
		
		//最高分90.66，姓名 永强，性别男，未婚
		//在赋值中单双精度必须在数字末标记 f和d.
		double score=90.66d;
		//单个字符用char加单引号，多个字符用string加双引号。
		String name="永强";
				char sex='男';
				boolean marry=false;
				//输出最高分
				
			//变量和字符串用+号连接。
		System.out.println("班里的最高分是"+score); 
		//输出最高分的姓名
		System.out.println("最高分得主；"+name);
		//输出得主性别
		System.out.println("性别："+sex);
		//输出婚否
		System.out.println("婚否："+marry);
	/*
	 软件开发需要63天，每周工作5天，项目从下周三开始，结束项目是星期几？
	 (63/5+3)%5	
	 */
		 //work为项目周期
		int work=63;
		 //overplus为项目周期内剩余的天数
		 int overplus=work%5;
		 //day为项目完成后星期几
		 int day=(overplus+3)%5;
		 //输出结果
		 System.out.println("项目完成时是星期："+day);
		 

	/*
	 小岩体重60.5公斤，努力减掉5公斤，现在体重多少	 
	 */
		 //小岩体重为weight
		double weight=60.5;
		//小岩减掉体重为decrease
		int decrease=5;
		//result为减掉后体重
		double result=weight-decrease;
		//输出小岩现在体重
		System.out.println("小岩现在体重为："+result);
	/*
	 公司今年的业务为36，每年12%的增长，明年的业务量为多少	
	 */
		//业务量为thisYear
		int thisYear=36;
		//明年的增长业务量grow
		double grow=0.12;
		//明年的业务量为nextYear
		double nextYear=thisYear*(1+grow);
		//业务量不可能为小数，所以强制转换
		int result2=(int)nextYear;
		 //输出结果比对
		System.out.println(nextYear);
		System.out.println("明年的业务量为"+result2);
		
		//强制转换的特例 
		byte age=36;
		char age1=(char)age;
		System.out.println(age1);
		
		System.out.println(3+6+"=3+6");
		System.out.println("3+6="+3+6);
		  
		 

	}
	
}
