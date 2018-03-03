package test2;

public class Cartper2 {

	public static void main(String[] args) {
		
		//存放java数据
		int javaScore=0;
		//存放数据库成绩
		int dbScore=0;
		//存放网页成绩
		int htmlScore=0;
		//java.util.Scanner类中接受控制台的输入信息
		java.util.Scanner input=new java.util.Scanner(System.in);
		//输入输出java成绩
		System.out.println("请输入java成绩：");
		javaScore=input.nextInt();
		//输入输出数据库成绩
		System.out.println("请输入数据库成绩：");
		dbScore=input.nextInt();
		//输入输出网页成绩
		System.out.println("请输入网页成绩：");
		htmlScore=input.nextInt();
		//三科的平均成绩是
		double result=(javaScore+dbScore+htmlScore)/3;
		//输出平均值
		System.out.println("平均成绩是：");
		System.out.println(result);
		
		/*
		 * ++和--的自增自减实验，++在前则本身自加,赋予的值自加1.++在后本身自加，赋予的值不加。
		 * 
		 */
		int number=10;
		int result2=0;
		int result3=0;
		//result2为++在前的结果，result3为++在后的结果。
		result2=++number;
		//分别输出result2和number的值
		System.out.println();
		System.out.print("result2=");System.out.print(result2);
		System.out.print(",number=");System.out.println(number);
		number=10;
		result3=number++;
		//分别输出result3和number的值
		System.out.print("result3=");System.out.print(result3);
		System.out.print(",number=");System.out.println(number);
		
		//复合赋值运算，+=，-=，*=,/=,%=.自身的加减乘除的运算
		int a=10;a+=3;
		System.out.println();
		System.out.print("a=");System.out.println(a);
		int b=10;b/=3;
		System.out.print("b=");System.out.println(b);
		
		
		
		
		
		
		
		

		
		
	}

}
