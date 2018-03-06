package test5;

import java.util.*;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-
		/*
		 * 小美考了5门成绩，分别输入5门成绩，并计算出平均成绩。1.循环5次。2，输入5次成绩并加起来。3，算出平均值输出。
		 */
		// System.out.println("请输入第5科成绩：");
		Scanner input = new Scanner(System.in);

		/*
		 * double score=input.nextDouble();
		 * 
		 * int count=5; double avg=0,total=0; //count>1,因为第一次已经输入了，所以还要输入4次。
		 * while(count>1) {total+=score;count--;System.out.println("请输入第"+count+"科成绩：");
		 * score=input.nextDouble(); } total=total+score;//while运算中最后一次输入并没有加入到总成绩中。
		 * 
		 * avg=total/5; System.out.println("小美的平均成绩为"+avg);
		 */

		// for(变量声明；条件判断；变量改变){循环体}。
		double sum = 0, avg = 0;
		for (int count = 0; count < 5; count++) {
			System.out.println("请输入第" + (count + 1) + "门成绩：");
			double score = input.nextDouble();
			sum = sum + score;
		}

		System.out.println("小美的总成绩为" + sum);
		avg = sum / 5;
		System.out.println("小美的平均成绩为" + avg);
		/*
		 * 找出10到20间第一个被3整除的数
		 */
		System.out.println();
		int first = 0;
		for (int a = 10; a < 20; a++) {
			if (a % 3 == 0) {
				first = a;
				break;
			}
		}

		System.out.println("10到20间第一个被3整除的是" + first);
//用while循环，计算10到20之间第一个能被3整除的数。
		int b = 11;
		int scond = 0;
		while (b > 10 && b < 20) {
			if (b % 3 != 0) {
				b++;
				
			}
			
			else {scond = b;
			break;}
		}

		System.out.println("被3整除的数是：" + scond);
//1到5中显示除了3.4的数
		for(int c=1;c<=5;c++) 
		        {
			      if(c==3||c==4) {continue;}
			      
			      System.out.println(c);
		        }
		
		int d=1;int e=0;
		while(d>0&&d<6) {if(d!=3) {d++;continue;}}
		
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
	}

}
