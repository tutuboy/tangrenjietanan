package test;

public class Testtype {

	/**
	 ���������߷֣��������Ա�
	 */
	public static void main(String[] args) {
		/*
		 ��java������������8�֣����£�
		 �������ͣ�byte,short,int,long.
		�������ͣ�float,double.
		�ַ��ͣ�char
		�������ͣ�boolean
		�����������ͣ�string
		
		����������������
		1������������ĸ�����֣��»��ߣ���Ԫ�������
		2.���������������ֿ�ʼ
		3.�����м䲻���пո�
		4������ʹ��java�еĹؼ���
		5.����֪��
		6.����ĸСд��������������ʵڶ�����ĸ��д
		
		main�����������ı���ֻ���ھֲ�ʹ��
		 */
		
		
		//��߷�90.66������ ��ǿ���Ա��У�δ��
		//�ڸ�ֵ�е�˫���ȱ���������ĩ��� f��d.
		double score=90.66d;
		//�����ַ���char�ӵ����ţ�����ַ���string��˫���š�
		String name="��ǿ";
				char sex='��';
				boolean marry=false;
				//�����߷�
				
			//�������ַ�����+�����ӡ�
		System.out.println("�������߷���"+score); 
		//�����߷ֵ�����
		System.out.println("��߷ֵ�����"+name);
		//��������Ա�
		System.out.println("�Ա�"+sex);
		//������
		System.out.println("���"+marry);
	/*
	 ���������Ҫ63�죬ÿ�ܹ���5�죬��Ŀ����������ʼ��������Ŀ�����ڼ���
	 (63/5+3)%5	
	 */
		 //workΪ��Ŀ����
		int work=63;
		 //overplusΪ��Ŀ������ʣ�������
		 int overplus=work%5;
		 //dayΪ��Ŀ��ɺ����ڼ�
		 int day=(overplus+3)%5;
		 //������
		 System.out.println("��Ŀ���ʱ�����ڣ�"+day);
		 

	/*
	 С������60.5���Ŭ������5����������ض���	 
	 */
		 //С������Ϊweight
		double weight=60.5;
		//С�Ҽ�������Ϊdecrease
		int decrease=5;
		//resultΪ����������
		double result=weight-decrease;
		//���С����������
		System.out.println("С����������Ϊ��"+result);
	/*
	 ��˾�����ҵ��Ϊ36��ÿ��12%�������������ҵ����Ϊ����	
	 */
		//ҵ����ΪthisYear
		int thisYear=36;
		//���������ҵ����grow
		double grow=0.12;
		//�����ҵ����ΪnextYear
		double nextYear=thisYear*(1+grow);
		//ҵ����������ΪС��������ǿ��ת��
		int result2=(int)nextYear;
		 //�������ȶ�
		System.out.println(nextYear);
		System.out.println("�����ҵ����Ϊ"+result2);
		
		//ǿ��ת�������� 
		byte age=36;
		char age1=(char)age;
		System.out.println(age1);
		
		System.out.println(3+6+"=3+6");
		System.out.println("3+6="+3+6);
		  
		 

	}
	
}
