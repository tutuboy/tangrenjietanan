package test5;

import java.util.*;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-
		/*
		 * С������5�ųɼ����ֱ�����5�ųɼ����������ƽ���ɼ���1.ѭ��5�Ρ�2������5�γɼ�����������3�����ƽ��ֵ�����
		 */
		// System.out.println("�������5�Ƴɼ���");
		Scanner input = new Scanner(System.in);

		/*
		 * double score=input.nextDouble();
		 * 
		 * int count=5; double avg=0,total=0; //count>1,��Ϊ��һ���Ѿ������ˣ����Ի�Ҫ����4�Ρ�
		 * while(count>1) {total+=score;count--;System.out.println("�������"+count+"�Ƴɼ���");
		 * score=input.nextDouble(); } total=total+score;//while���������һ�����벢û�м��뵽�ܳɼ��С�
		 * 
		 * avg=total/5; System.out.println("С����ƽ���ɼ�Ϊ"+avg);
		 */

		// for(���������������жϣ������ı�){ѭ����}��
		double sum = 0, avg = 0;
		for (int count = 0; count < 5; count++) {
			System.out.println("�������" + (count + 1) + "�ųɼ���");
			double score = input.nextDouble();
			sum = sum + score;
		}

		System.out.println("С�����ܳɼ�Ϊ" + sum);
		avg = sum / 5;
		System.out.println("С����ƽ���ɼ�Ϊ" + avg);
		/*
		 * �ҳ�10��20���һ����3��������
		 */
		System.out.println();
		int first = 0;
		for (int a = 10; a < 20; a++) {
			if (a % 3 == 0) {
				first = a;
				break;
			}
		}

		System.out.println("10��20���һ����3��������" + first);
//��whileѭ��������10��20֮���һ���ܱ�3����������
		int b = 11;
		int scond = 0;
		while (b > 10 && b < 20) {
			if (b % 3 != 0) {
				b++;
				
			}
			
			else {scond = b;
			break;}
		}

		System.out.println("��3���������ǣ�" + scond);
//1��5����ʾ����3.4����
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
