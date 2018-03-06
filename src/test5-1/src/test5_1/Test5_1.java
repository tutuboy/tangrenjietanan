package test5_1;

import java.util.*;

public class Test5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 输出1到5之间除了3的数
        //用for（变量；条件；变量改变）{循环体}。continue为跳出本次循环。
		int a;
		for (a = 1; a <= 5; a++) {
			if (a == 3) {
				continue;
			}

			System.out.println(a);
		}

		//用while（条件）{循环体}
		System.out.println("结果如下：");
		int b=1;//定义一个变量
		while (b<=5)//循环条件为b<=5
		            {if (b!=3){System.out.println(b);b++;}//当b！=3时，输出值，并改变变量
		             
		            else{b++;continue;}//当b==3时，改变变量，并跳出本次循环，继续下次循环。
			        }
		//用do{循环体}while(条件)；do循环先执行一次，再判断。
		System.out.println("第三次输出结果：");
		int c=1;
		do{
			if(c==3){c++;continue;}//c==3，自加一次，跳出，再判断
			else{System.out.println(c);c++;}//c！=3，输出值，自加一次，再判断。
		}while(c<=5);
		
		//打印矩阵，用嵌套循环，先执行内循环，当内循环执行完，再执行外循环，直到结束。
		System.out.println("第一种方法打印：");
		for(int d=1;d<=5;d++)
		     {
			    for(int e=1;e<=5;e++)//内循环中，执行5次，并打印5个$，然后执行外循环。
			    {
			    	System.out.print("$");
			    }
			    
			    System.out.println();//外循环是在内循环每次完成后，执行以一次换行处理，共执行5次换行。
		     }
		//用for加while，打印矩阵
		System.out.println("第二种方法打印：");
		
		for(int f=1;f<=5;f++)
		     {    int g=1;//循环使用g
			      while(g<=5)
			      {
			    	  g++;System.out.print("*");
			      }
			   
			      System.out.println();
		     }
		//用while,打印矩阵
		System.out.println("第三次打印矩阵：");
		int h=1;
		while(h<=5)
		          {  int j=1;
			         while(j<=5)
			                   {
			        	          System.out.print("#");j++;
			                   }
			         System.out.println();h++;
		          }
		//用for打印三角形
		System.out.println("第一种方法打印三角形；");
		for(int k=1;k<=5;k++)//外循环控制打印次数。
		                    {
			                   for(int l=1;l<=k;l++)//k变量控制每行打印的个数。
			                                       {
			                	                     System.out.print("$");
			                                       }
			                   System.out.println();
		                    }
		//用while打印三角形
		System.out.println("第二种方法打印三角形：");
		int m=1;
		while(m<=5)//外循环控制打印行数
		          {  int n=1;
			         while(n<=m)//m变量控制每行打印个数
			                   {
			        	         System.out.print("*");n++;
			                   }
			         System.out.println();m++;
		          }
		//用for(变量；条件；改变变量){循环体}计数1+2+3+。。。+99的和
		
		int total=0;
		for(int y=1;y<=99;y++) 
		                    {
			                   total+=y;//每次循环都把y的值赋给total,total=total+y.
		                    }
		 System.out.println("求和的值为"+total);
		
		 //有10名学生，考了两门，分别显示成绩，并计数两门课的平均成绩
		 Scanner input=new Scanner(System.in);//引入输入类包，
		 
		 double ch=0,eng=0,avgCh=0,avgEng=0;
		 for(int i=1;i<=2;i++)//外循环控制学生人数。
		                       {
			                      for(int o=1;o<=2;o++)//内循环控制两个不同的学科。
			                                          {if(o==1)//用if，else,语句控制第几个学生和第几科的输入。
			                    	                    {System.out.print("请输入第"+i+"个学生第"+o+"科成绩：");
			                    	                    double enter1=input.nextDouble();//用input定义输入值
			                    	                    ch+=enter1;//把输入的成绩赋给ch变量，达到求和目的。
			                    	                    }
			                                          else{System.out.print("请输入第"+i+"个学生第"+o+"科成绩：");
			                                              double enter2=input.nextDouble();
			                                              eng=eng+enter2;
			                                              }
			                                          }
		                       }
		  
		   avgCh=ch/10;avgEng=eng/10;
		   System.out.println("全班的语文总成绩为"+ch+",平均成绩为"+avgCh);
		   System.out.println("全班的数学总成绩为"+eng+",平均成绩为"+avgEng);
		
		//用for(变量；条件；改变变量){循环体}打印出99乘法表。
		   System.out.println("99乘法表：");
		   for(int p=1;p<=4;p++)//p变量控制乘法表中的定数1-9.
		                {
			               for(int v=1;v<=p;v++)// v变量控制乘法表中的变数
			                          {
			            	             System.out.print(p*v+" ");
			                          }
			               System.out.println("");
		                }
		 //有一个数满足条件
		   System.out.println("第一种方法满足的数字为：");
		   int r,e,w,q;//rewq;用到break;
		  
		   for(r=1;r<=9;r++)//思维数字，四个嵌套，每个管控一位数字，直到满足if条件，输出结果。
		            {
			           for(e=0;e<=9;e++)
			                 {
			        	         for(w=0;w<=9;w++)
			        	                  {
			        	        	           for(q=0;q<=9;q++)
			        	        	                     {
			        	        	               if(r+e==w&&r*e==q&&r+w==q)
			        	        	                 {
			        	        	        	         System.out.print(r);
			        	        	        	         System.out.print(e);
			        	        	        	         System.out.print(w);
			        	        	        	         System.out.print(q);
			        	        	        	         System.out.println();
			        	        	        	         
			        	 
			        	   //System.out.println(r+e+w+q);//为什么这样输出的数字为两位数。
			        	   //System.out.println(r+"@"+e+"#"+w+"$"+q+"&");//这样输出的数字却为4为数，只是中间多了几个符号。
			        	  
			        	   //break;	//满足条件就中断         
			        	        	        	         
			        	        	                 }
			        	        	             //  else{continue;}//不满足条件跳出本次循环，继续下次循环
			        	        	               
			        	        	                     }
			        	                  }
			                 }
		            }
		   //非嵌套循环找出满足的数字。
		   System.out.println("第二种方法满足的数字为：");
		   int aa,bb,cc,dd,num=1000;//定义一个四位数，用求余的方法，定义个，十，百，千。
		   
		   
		   while(num<=9999&&num>=1000)
		             {     aa=num/1000;bb=num%1000/100;cc=num%100/10;dd=num%10;//把求余的数赋给四个int型
			               if( aa+bb==cc&&aa*bb==dd&&aa+cc==dd)//满足条件，则输出
			                    {
			            	        System.out.println(num);
			            	        num++;//变量更改
			                    }
			               else {num++;continue;}
			               
		             } 
		   
		
		   
		   
		   
		   
		   
		
		
	}

}
