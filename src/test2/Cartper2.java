package test2;

public class Cartper2 {

	public static void main(String[] args) {
		
		//���java����
		int javaScore=0;
		//������ݿ�ɼ�
		int dbScore=0;
		//�����ҳ�ɼ�
		int htmlScore=0;
		//java.util.Scanner���н��ܿ���̨��������Ϣ
		java.util.Scanner input=new java.util.Scanner(System.in);
		//�������java�ɼ�
		System.out.println("������java�ɼ���");
		javaScore=input.nextInt();
		//����������ݿ�ɼ�
		System.out.println("���������ݿ�ɼ���");
		dbScore=input.nextInt();
		//���������ҳ�ɼ�
		System.out.println("��������ҳ�ɼ���");
		htmlScore=input.nextInt();
		//���Ƶ�ƽ���ɼ���
		double result=(javaScore+dbScore+htmlScore)/3;
		//���ƽ��ֵ
		System.out.println("ƽ���ɼ��ǣ�");
		System.out.println(result);
		
		/*
		 * ++��--�������Լ�ʵ�飬++��ǰ�����Լ�,�����ֵ�Լ�1.++�ں����Լӣ������ֵ���ӡ�
		 * 
		 */
		int number=10;
		int result2=0;
		int result3=0;
		//result2Ϊ++��ǰ�Ľ����result3Ϊ++�ں�Ľ����
		result2=++number;
		//�ֱ����result2��number��ֵ
		System.out.println();
		System.out.print("result2=");System.out.print(result2);
		System.out.print(",number=");System.out.println(number);
		number=10;
		result3=number++;
		//�ֱ����result3��number��ֵ
		System.out.print("result3=");System.out.print(result3);
		System.out.print(",number=");System.out.println(number);
		
		//���ϸ�ֵ���㣬+=��-=��*=,/=,%=.����ļӼ��˳�������
		int a=10;a+=3;
		System.out.println();
		System.out.print("a=");System.out.println(a);
		int b=10;b/=3;
		System.out.print("b=");System.out.println(b);
		
		
		
		
		
		
		
		

		
		
	}

}
