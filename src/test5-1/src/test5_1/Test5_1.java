package test5_1;

import java.util.*;

public class Test5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ���1��5֮�����3����
        //��for�������������������ı䣩{ѭ����}��continueΪ��������ѭ����
		int a;
		for (a = 1; a <= 5; a++) {
			if (a == 3) {
				continue;
			}

			System.out.println(a);
		}

		//��while��������{ѭ����}
		System.out.println("������£�");
		int b=1;//����һ������
		while (b<=5)//ѭ������Ϊb<=5
		            {if (b!=3){System.out.println(b);b++;}//��b��=3ʱ�����ֵ�����ı����
		             
		            else{b++;continue;}//��b==3ʱ���ı����������������ѭ���������´�ѭ����
			        }
		//��do{ѭ����}while(����)��doѭ����ִ��һ�Σ����жϡ�
		System.out.println("��������������");
		int c=1;
		do{
			if(c==3){c++;continue;}//c==3���Լ�һ�Σ����������ж�
			else{System.out.println(c);c++;}//c��=3�����ֵ���Լ�һ�Σ����жϡ�
		}while(c<=5);
		
		//��ӡ������Ƕ��ѭ������ִ����ѭ��������ѭ��ִ���꣬��ִ����ѭ����ֱ��������
		System.out.println("��һ�ַ�����ӡ��");
		for(int d=1;d<=5;d++)
		     {
			    for(int e=1;e<=5;e++)//��ѭ���У�ִ��5�Σ�����ӡ5��$��Ȼ��ִ����ѭ����
			    {
			    	System.out.print("$");
			    }
			    
			    System.out.println();//��ѭ��������ѭ��ÿ����ɺ�ִ����һ�λ��д�����ִ��5�λ��С�
		     }
		//��for��while����ӡ����
		System.out.println("�ڶ��ַ�����ӡ��");
		
		for(int f=1;f<=5;f++)
		     {    int g=1;//ѭ��ʹ��g
			      while(g<=5)
			      {
			    	  g++;System.out.print("*");
			      }
			   
			      System.out.println();
		     }
		//��while,��ӡ����
		System.out.println("�����δ�ӡ����");
		int h=1;
		while(h<=5)
		          {  int j=1;
			         while(j<=5)
			                   {
			        	          System.out.print("#");j++;
			                   }
			         System.out.println();h++;
		          }
		//��for��ӡ������
		System.out.println("��һ�ַ�����ӡ�����Σ�");
		for(int k=1;k<=5;k++)//��ѭ�����ƴ�ӡ������
		                    {
			                   for(int l=1;l<=k;l++)//k��������ÿ�д�ӡ�ĸ�����
			                                       {
			                	                     System.out.print("$");
			                                       }
			                   System.out.println();
		                    }
		//��while��ӡ������
		System.out.println("�ڶ��ַ�����ӡ�����Σ�");
		int m=1;
		while(m<=5)//��ѭ�����ƴ�ӡ����
		          {  int n=1;
			         while(n<=m)//m��������ÿ�д�ӡ����
			                   {
			        	         System.out.print("*");n++;
			                   }
			         System.out.println();m++;
		          }
		//��for(�������������ı����){ѭ����}����1+2+3+������+99�ĺ�
		
		int total=0;
		for(int y=1;y<=99;y++) 
		                    {
			                   total+=y;//ÿ��ѭ������y��ֵ����total,total=total+y.
		                    }
		 System.out.println("��͵�ֵΪ"+total);
		
		 //��10��ѧ�����������ţ��ֱ���ʾ�ɼ������������ſε�ƽ���ɼ�
		 Scanner input=new Scanner(System.in);//�������������
		 
		 double ch=0,eng=0,avgCh=0,avgEng=0;
		 for(int i=1;i<=2;i++)//��ѭ������ѧ��������
		                       {
			                      for(int o=1;o<=2;o++)//��ѭ������������ͬ��ѧ�ơ�
			                                          {if(o==1)//��if��else,�����Ƶڼ���ѧ���͵ڼ��Ƶ����롣
			                    	                    {System.out.print("�������"+i+"��ѧ����"+o+"�Ƴɼ���");
			                    	                    double enter1=input.nextDouble();//��input��������ֵ
			                    	                    ch+=enter1;//������ĳɼ�����ch�������ﵽ���Ŀ�ġ�
			                    	                    }
			                                          else{System.out.print("�������"+i+"��ѧ����"+o+"�Ƴɼ���");
			                                              double enter2=input.nextDouble();
			                                              eng=eng+enter2;
			                                              }
			                                          }
		                       }
		  
		   avgCh=ch/10;avgEng=eng/10;
		   System.out.println("ȫ��������ܳɼ�Ϊ"+ch+",ƽ���ɼ�Ϊ"+avgCh);
		   System.out.println("ȫ�����ѧ�ܳɼ�Ϊ"+eng+",ƽ���ɼ�Ϊ"+avgEng);
		
		//��for(�������������ı����){ѭ����}��ӡ��99�˷���
		   System.out.println("99�˷���");
		   for(int p=1;p<=4;p++)//p�������Ƴ˷����еĶ���1-9.
		                {
			               for(int v=1;v<=p;v++)// v�������Ƴ˷����еı���
			                          {
			            	             System.out.print(p*v+" ");
			                          }
			               System.out.println("");
		                }
		 //��һ������������
		   System.out.println("��һ�ַ������������Ϊ��");
		   int r,e,w,q;//rewq;�õ�break;
		  
		   for(r=1;r<=9;r++)//˼ά���֣��ĸ�Ƕ�ף�ÿ���ܿ�һλ���֣�ֱ������if��������������
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
			        	        	        	         
			        	 
			        	   //System.out.println(r+e+w+q);//Ϊʲô�������������Ϊ��λ����
			        	   //System.out.println(r+"@"+e+"#"+w+"$"+q+"&");//�������������ȴΪ4Ϊ����ֻ���м���˼������š�
			        	  
			        	   //break;	//�����������ж�         
			        	        	        	         
			        	        	                 }
			        	        	             //  else{continue;}//������������������ѭ���������´�ѭ��
			        	        	               
			        	        	                     }
			        	                  }
			                 }
		            }
		   //��Ƕ��ѭ���ҳ���������֡�
		   System.out.println("�ڶ��ַ������������Ϊ��");
		   int aa,bb,cc,dd,num=1000;//����һ����λ����������ķ������������ʮ���٣�ǧ��
		   
		   
		   while(num<=9999&&num>=1000)
		             {     aa=num/1000;bb=num%1000/100;cc=num%100/10;dd=num%10;//��������������ĸ�int��
			               if( aa+bb==cc&&aa*bb==dd&&aa+cc==dd)//���������������
			                    {
			            	        System.out.println(num);
			            	        num++;//��������
			                    }
			               else {num++;continue;}
			               
		             } 
		   
		
		   
		   
		   
		   
		   
		
		
	}

}
