package test4;

import java.util.*;

public class Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User wei = new User("weiwei", 30);// user类中无static，所以要用new调用，才能使用。

		System.out.println(wei.getName());
		System.out.println(wei.getAge());
		String str = wei.work();
		System.out.println(str);
		String st = wei.eat("mifan");
		System.out.println(st);
		/*
		 * 从1加到10000，的结果是多少。1.用while循环。2，用复合赋值运算符+=，进行自加运算3.定义循环变量，结束循环
		 */
		int i = 1;
		int j = 0;
		while (i <= 3) {// 循环条件必须明确
			j += i;// j进行自加的复合赋值运算
			i++;// 循环体里改变循环变量i

		}
		System.out.println("结果是：" + j);
		/*
		 * 循环小实验
		 */
		int g = 1, num = 10;
		while (g <= 3) {
			System.out.println("g=" + g);
			g++;
		}
		/*
		 * 输入一个正整n,求1+2+n的和。 //1，调用while循环。2.循环次数为n次。3.运用复合赋值运算符+=，自加++
		 */
		System.out.println("请输入一个正整数：");
		while(true) //如果输入有误会一直循环输入，直到输入正确，结束运行。
		{
			Scanner input2 = new Scanner(System.in);
			int n = input2.nextInt();
			int m = 1, z = 0;
			if (n > 0) {
				while (m <= n) // 判断条件，就是循环的次数。
				{
					z += m;
					m++;
				} // z=z+m.两种表达方式。必须要有自加输出值。z为存放加法的结果。
				System.out.println("输入的值求和的结果为：" + z);
				break;
			}
			else {
				System.out.println("输入有误，请输入正整数。");
			}
		}
		/*
		 * 循环输入班级成绩，输入-1时返回，并找出最高值。
		 */
		System.out.println("请输入第一个成绩：");
		
		Scanner input=new Scanner(System.in);//while 套用if.
        int max=-1;//存放最大值。
        int in=-1;//存放输入的值。
        int count=1;//输入成绩的次数。
        while(true)   {//如果输入的值为负数，则提醒输入正确的数，并再次进入程序。
        in=input.nextInt();
       /*
        while(in!=-1) {//循环体为最大值与输入值比较，并且有计数来判断第几次输入。
                     	if(in>max) {max=in;}
                     	count++;System.out.println("请输入第"+count+"次成绩：");
                     	in=input.nextInt();
                      }
         {System.out.println("最高分为："+max);}
		*/
		
		//使用do,while执行。循环体在大括号内，条件在小括号内。
   
     	 
    	 if(in>=0) {
    		 
		do {
			if(in>max) {max=in;}
			count++;
			System.out.println("请输入第"+count+"次成绩：");
			in=input.nextInt();
		   }
		while(in!=-1);
		
		System.out.println("最高成绩为："+max);break;
    	            }
    	                     
    	 else {System.out.println("请输入正确的成绩：");}
    	 
		                 }
		
        /*
         * 猴子吃桃问题，
         */
        
        int day=10;//桃子总共吃的天数
         int x=1,y=0;//x是第十天剩的桃子，y定义为前一天的桃子数。
         while(day>0) {x=(x+1)*2;day--;y=x;}
         System.out.println("第一天摘的桃子为"+y);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
          
	}

}
