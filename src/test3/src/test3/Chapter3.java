package test3;

import java.util.*;

public class Chapter3 {

	public static void main(String[] args) {
		// �����������˳��ṹ����֧�ṹ��ѭ���ṹ��
		// ��֧�ṹ���ж���������ϵ��������߼��������>,<,>=,<=,==,!=.
		boolean first = 3 > 2;// ����Ϊtrue
		boolean scond = 3 < 5;// ����Ϊtrue
		boolean three = 5 == 6;// ����Ϊtrue
		boolean four = 8 != 8;// ����Ϊfalse
		// �߼��������&&��||����
		boolean five = (6 > 2) && (8 > 10);// ����Ϊfalse
		boolean six = (6 > 2) || (8 > 10);// ����Ϊtrue
		boolean seven = !(6 > 5);// ����Ϊfalse
		boolean eight = !(five || six);// ����Ϊfalse	

		/*
		 * ��֧�ṹ�����������������ôִ�д���A������ִ��B��if����{}else{}.
		 */
		int a = 6;
		int b = 8;
		if (a > b) {
			System.out.println("a����b");// a>bִ��
		} else {
			System.out.println("aС�ڵ���b");// a<=bִ��
		}
		if (a % 2 == 0) {
			System.out.println("a��ż��");
		} // if��������

		if (b < 0) {
			System.out.println("b�Ǹ���");
		} // ���ᱻִ��

		if ((a > 0) && (b > 0)) {
			System.out.println("a��b��������");
		} // �ᱻִ��

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
		 * else if ����ʵ�ֶ�·��֧�ṹ
		 */
		if (a < 0) {
			System.out.println("a�Ǹ���");
		} else if (a == 0) {
			System.out.println("a����0");
		}

		else {
			System.out.println("a������");
		}

		/*
		 * ����һ����ݣ��ж��ǲ�������
		 * 
		 */
		System.out.println("��������ݣ�");
		Scanner sc = new Scanner(System.in);// ����java.util.Scanner���� ̨������Ϣ
		int year = sc.nextInt();
		//sc.close();

		/*
		 * if (year%4==0) {
		 * 
		 * if (year%100==0) { if(year%400==0) { System.out.println("����"); } else {
		 * System.out.println("��������"); } } else { System.out.println("������"); } } else {
		 * System.out.println("��������"); }
		 */

		/*
		 * �������֤
		 */

		boolean is = false;// Ĭ�ϲ�������
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			is = true;
		}

		System.out.println(is ? "������" : "��������");

		/*
		 * ��Ŀ�����ʹ��
		 */
		System.out.println(3 <2 ? "true" : "false");

		/*
		 * ��ʦ�������⣬��1��ˣ���2�ܲ�����3�⣬��4�׷�����5�������ĩ��Ϣ�� ����java.util.Scanner����̨�����ܼ�
		 */
		System.out.println("���������Ϊ���ڼ�����ѯ�˵���");
		Scanner week = new Scanner(System.in);
		int weeks = week.nextInt();//����������Ϊweeks
		if (weeks > 0 && weeks < 8) {

			if (weeks == 1) {
				System.out.println("���");
			} else if (weeks == 2) {
				System.out.println("�ܲ�");
			} else if (weeks == 3) {
				System.out.println("��");
			} else if (weeks == 4) {
				System.out.println("�׷�");
			} else if (weeks == 5) {
				System.out.println("���");
			} else if (weeks == 6 || weeks == 7) {
				System.out.println("������Ϣ������1��");
			}

		} else {
			System.out.println("����������������������룺");//���������
		}
	   System.out.println("���ٴ�����ȷ�ϣ�");
	   int weeks2=week.nextInt();
		switch (weeks2) {
		                case 1:System.out.println("���");break;//�������break��β����һֱ������ȥ
		                case 2:System.out.println("�ܲ�");break;
		                case 3:System.out.println("��");break;
		                case 4:System.out.println("�׷�");break;
		                case 5:System.out.println("���");break;
		                default:System.out.println("������Ϣ������1��");// ���û������ģ���ִ��Ĭ��
		
		}
		
		/*
		 * ���㳤���е�������û����볤����͸ߣ��������Ŀ�͸�С�ڵ���0������ʾ�û��������
		 * 
		 */
		System.out.println("�������");
		int width=week.nextInt();
		System.out.println("������ߣ�");
		int height=week.nextInt();
		int area;
		if(width<=0||height<=0) 
		                     {
			                   System.out.println("����������˳���");//����һ���������˳�
		                     }
		else {System.out.print("�����ε����Ϊ:");area=width*height;System.out.println(area);}
		
		/*
		 * ����һ����ݣ��ж���������12��Ф�е���һ�ꡣ��12������Ϊ������1��Ϊ����2��Ϊ���Դ�����
		 */
		System.out.println("������һ����ݣ�");
		int year2=week.nextInt();//��һ�ַ�������switch��䣬����������ȡ�࣬����switch�����,�Դ����Ƴ�ʮ������Ф�ꡣ
		int year3=year2%12;
		switch (year3) {
		case 0:System.out.println(year2+"���Ǻ���");break;
		case 1:System.out.println(year2+"���Ǽ���");break;
		case 2:System.out.println(year2+"���ǹ���");break;
		case 3:System.out.println(year2+"��������");break;
		case 4:System.out.println(year2+"��������");break;
		case 5:System.out.println(year2+"����ţ��");break;
		case 6:System.out.println(year2+"���ǻ���");break;
		case 7:System.out.println(year2+"��������");break;
		case 8:System.out.println(year2+"��������");break;
		case 9:System.out.println(year2+"��������");break;
		case 10:System.out.println(year2+"��������");break;
		case 11:System.out.println(year2+"��������");break;
		}
		
		System.out.println("���ٴ�����һ����ݣ�");
		int year4=week.nextInt();//��if��else if,�������ֵȡ�࣬����if,else if���ж�ʮ����Ф�ꡣ
		if (year4%12==0) {System.out.println(year4+"���Ǻ���");}
		else if(year4%12==1) {System.out.println(year4+"���Ǽ���");}
		else if(year4%12==2) {System.out.println(year4+"���ǹ���");}
		else if(year4%12==3) {System.out.println(year4+"��������");}
		else if(year4%12==4) {System.out.println(year4+"��������");}
		else if(year4%12==5) {System.out.println(year4+"����ţ��");}
		else if(year4%12==6) {System.out.println(year4+"���ǻ���");}
		else if(year4%12==7) {System.out.println(year4+"��������");}
		else if(year4%12==8) {System.out.println(year4+"��������");}
		else if(year4%12==9) {System.out.println(year4+"��������");}
		else if(year4%12==10) {System.out.println(year4+"������");}
		else  {System.out.println(year4+"��������");}
		
		/*
		 * ���������ε��ܳ����ж������ֵ�Ƿ����
		 */
		
		System.out.println("��ֱ��������������߳��ȣ����ֱ��»س�����");//��if���߼������ң��ж����߹�ϵ
		int side1=week.nextInt(),side2=week.nextInt(),side3=week.nextInt();
		if (side1>0&&side2>0&&side3>0&&side1+side2>side3&&side1+side3>side2&&side2+side3>side1)
		{System.out.print("�����ε��ܳ�Ϊ��");System.out.println(side1+side2+side3);}
		else {System.out.println("����������γ�������");}
		
		/*
		 * �������Ѵ����
		 */
		
		System.out.println("���������ѽ�");
		double money=week.nextDouble();
		if(money>=50)
		{if (money>=50&&money<100)       {System.out.println("����1������");}
		else if(money>=100&&money<200){System.out.println("����2������");}
		else if(money>=200&&money<500) {System.out.println("����5������");}
		else if(money>=500&&money<1000) {System.out.println("����15������");}
		else if(money>=1000){System.out.println("����50������");}
		}
		else {System.out.println("��û�����㳬�д��������.");}
		
		
		
		
	}

}
