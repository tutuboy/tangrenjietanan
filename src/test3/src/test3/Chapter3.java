package test3;

import java.util.*;

public class Chapter3 {

	public static void main(String[] args) {
		// 程序运算存在顺序结构，分支结构，循环结构。
		// 分支结构，判断条件（关系运算符和逻辑运算符）>,<,>=,<=,==,!=.
		boolean first = 3 > 2;// 返回为true
		boolean scond = 3 < 5;// 返回为true
		boolean three = 5 == 6;// 返回为true
		boolean four = 8 != 8;// 返回为false
		// 逻辑运算符，&&，||，！
		boolean five = (6 > 2) && (8 > 10);// 返回为false
		boolean six = (6 > 2) || (8 > 10);// 返回为true
		boolean seven = !(6 > 5);// 返回为false
		boolean eight = !(five || six);// 返回为false	

		/*
		 * 分支结构，如果（表达成立）那么执行代码A，否则执行B。if（）{}else{}.
		 */
		int a = 6;
		int b = 8;
		if (a > b) {
			System.out.println("a大于b");// a>b执行
		} else {
			System.out.println("a小于等于b");// a<=b执行
		}
		if (a % 2 == 0) {
			System.out.println("a是偶数");
		} // if单个引用

		if (b < 0) {
			System.out.println("b是负数");
		} // 不会被执行

		if ((a > 0) && (b > 0)) {
			System.out.println("a和b都是正数");
		} // 会被执行

		int c = 2, d = 9; 
		int max = 0;
		if (c > d) {
			//System.out.print(max);
			System.out.print("max=");
			max = c;
			System.out.println(max);
		} else {
			System.out.print("max=");
			System.out.println(max = d);
		}

		/*
		 * else if 可以实现多路分支结构
		 */
		if (a < 0) {
			System.out.println("a是负数");
		} else if (a == 0) {
			System.out.println("a等于0");
		}

		else {
			System.out.println("a是正数");
		}

		/*
		 * 输入一个年份，判断是不是闰年
		 * 
		 */
		System.out.println("请输入年份：");
		Scanner sc = new Scanner(System.in);// 引用java.util.Scanner控制 台输入信息
		int year = sc.nextInt();
		//sc.close();

		/*
		 * if (year%4==0) {
		 * 
		 * if (year%100==0) { if(year%400==0) { System.out.println("闰年"); } else {
		 * System.out.println("不是闰年"); } } else { System.out.println("是闰年"); } } else {
		 * System.out.println("不是闰年"); }
		 */

		/*
		 * 用真假验证
		 */

		boolean is = false;// 默认不是闰年
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			is = true;
		}

		System.out.println(is ? "是闰年" : "不是闰年");

		/*
		 * 三目运算符使用
		 */
		System.out.println(3 <2 ? "true" : "false");

		/*
		 * 厨师菜谱问题，周1青菜，周2萝卜，周3肉，周4米饭，周5火锅，周末休息。 引用java.util.Scanner控制台输入周几
		 */
		System.out.println("请输入今天为星期几，查询菜单：");
		Scanner week = new Scanner(System.in);
		int weeks = week.nextInt();//定义输入数为weeks
		if (weeks > 0 && weeks < 8) {

			if (weeks == 1) {
				System.out.println("青菜");
			} else if (weeks == 2) {
				System.out.println("萝卜");
			} else if (weeks == 3) {
				System.out.println("肉");
			} else if (weeks == 4) {
				System.out.println("米饭");
			} else if (weeks == 5) {
				System.out.println("火锅");
			} else if (weeks == 6 || weeks == 7) {
				System.out.println("今天休息，下周1见");
			}

		} else {
			System.out.println("输入的数字有误，请重新输入：");//不成立输出
		}
	   System.out.println("请再次输入确认：");
	   int weeks2=week.nextInt();
		switch (weeks2) {
		                case 1:System.out.println("青菜");break;//如果不用break结尾，则一直运行下去
		                case 2:System.out.println("萝卜");break;
		                case 3:System.out.println("肉");break;
		                case 4:System.out.println("米饭");break;
		                case 5:System.out.println("火锅");break;
		                default:System.out.println("今天休息，下周1见");// 如果没有满足的，则执行默认
		
		}
		
		/*
		 * 计算长方行的面积，用户输入长方宽和高，如果输入的宽和高小于等于0，则提示用户输入错误。
		 * 
		 */
		System.out.println("请输入宽：");
		int width=week.nextInt();
		System.out.println("请输入高：");
		int height=week.nextInt();
		int area;
		if(width<=0||height<=0) 
		                     {
			                   System.out.println("输入错误，请退出。");//满足一个条件就退出
		                     }
		else {System.out.print("长方形的面积为:");area=width*height;System.out.println(area);}
		
		/*
		 * 输入一个年份，判断这个年份是12生肖中的那一年。被12整除则为狗，余1则为猪，余2则为鼠，以此类推
		 */
		System.out.println("请输入一个年份：");
		int year2=week.nextInt();//第一种方法，用switch语句，把输入的年份取余，放入switch语句中,以此类推出十二个生肖年。
		int year3=year2%12;
		switch (year3) {
		case 0:System.out.println(year2+"年是候年");break;
		case 1:System.out.println(year2+"年是鸡年");break;
		case 2:System.out.println(year2+"年是狗年");break;
		case 3:System.out.println(year2+"年是猪年");break;
		case 4:System.out.println(year2+"年是鼠年");break;
		case 5:System.out.println(year2+"年是牛年");break;
		case 6:System.out.println(year2+"年是虎年");break;
		case 7:System.out.println(year2+"年是兔年");break;
		case 8:System.out.println(year2+"年是龙年");break;
		case 9:System.out.println(year2+"年是蛇年");break;
		case 10:System.out.println(year2+"年是马年");break;
		case 11:System.out.println(year2+"年是羊年");break;
		}
		
		System.out.println("请再次输入一个年份：");
		int year4=week.nextInt();//用if，else if,把输入的值取余，放入if,else if中判断十二生肖年。
		if (year4%12==0) {System.out.println(year4+"年是候年");}
		else if(year4%12==1) {System.out.println(year4+"年是鸡年");}
		else if(year4%12==2) {System.out.println(year4+"年是狗年");}
		else if(year4%12==3) {System.out.println(year4+"年是猪年");}
		else if(year4%12==4) {System.out.println(year4+"年是鼠年");}
		else if(year4%12==5) {System.out.println(year4+"年是牛年");}
		else if(year4%12==6) {System.out.println(year4+"年是虎年");}
		else if(year4%12==7) {System.out.println(year4+"年是兔年");}
		else if(year4%12==8) {System.out.println(year4+"年是龙年");}
		else if(year4%12==9) {System.out.println(year4+"年是蛇年");}
		else if(year4%12==10) {System.out.println(year4+"年马鸡年");}
		else  {System.out.println(year4+"年是羊年");}
		
		/*
		 * 计算三角形的周长，判断输入的值是否合理。
		 */
		
		System.out.println("请分别输入三角形三边长度，并分别按下回车键：");//用if，逻辑运算且，判断三边关系
		int side1=week.nextInt(),side2=week.nextInt(),side3=week.nextInt();
		if (side1>0&&side2>0&&side3>0&&side1+side2>side3&&side1+side3>side2&&side2+side3>side1)
		{System.out.print("三角形的周长为：");System.out.println(side1+side2+side3);}
		else {System.out.println("输入的三角形长度有误：");}
		
		/*
		 * 超市消费促销活动
		 */
		
		System.out.println("请输入消费金额：");
		double money=week.nextDouble();
		if(money>=50)
		{if (money>=50&&money<100)       {System.out.println("赠送1个鸡蛋");}
		else if(money>=100&&money<200){System.out.println("赠送2个鸡蛋");}
		else if(money>=200&&money<500) {System.out.println("赠送5个鸡蛋");}
		else if(money>=500&&money<1000) {System.out.println("赠送15个鸡蛋");}
		else if(money>=1000){System.out.println("赠送50个鸡蛋");}
		}
		else {System.out.println("你没有满足超市促销活动规则.");}
		
		
		
		
	}

}
