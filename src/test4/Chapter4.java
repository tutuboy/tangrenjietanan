package test4;

import java.util.*;

public class Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User wei = new User("weiwei", 30);// user������static������Ҫ��new���ã�����ʹ�á�

		System.out.println(wei.getName());
		System.out.println(wei.getAge());
		String str = wei.work();
		System.out.println(str);
		String st = wei.eat("mifan");
		System.out.println(st);
		/*
		 * ��1�ӵ�10000���Ľ���Ƕ��١�1.��whileѭ����2���ø��ϸ�ֵ�����+=�������Լ�����3.����ѭ������������ѭ��
		 */
		int i = 1;
		int j = 0;
		while (i <= 3) {// ѭ������������ȷ
			j += i;// j�����Լӵĸ��ϸ�ֵ����
			i++;// ѭ������ı�ѭ������i

		}
		System.out.println("����ǣ�" + j);
		/*
		 * ѭ��Сʵ��
		 */
		int g = 1, num = 10;
		while (g <= 3) {
			System.out.println("g=" + g);
			g++;
		}
		/*
		 * ����һ������n,��1+2+n�ĺ͡� //1������whileѭ����2.ѭ������Ϊn�Ρ�3.���ø��ϸ�ֵ�����+=���Լ�++
		 */
		System.out.println("������һ����������");
		while(true) //������������һֱѭ�����룬ֱ��������ȷ���������С�
		{
			Scanner input2 = new Scanner(System.in);
			int n = input2.nextInt();
			int m = 1, z = 0;
			if (n > 0) {
				while (m <= n) // �ж�����������ѭ���Ĵ�����
				{
					z += m;
					m++;
				} // z=z+m.���ֱ�﷽ʽ������Ҫ���Լ����ֵ��zΪ��żӷ��Ľ����
				System.out.println("�����ֵ��͵Ľ��Ϊ��" + z);
				break;
			}
			else {
				System.out.println("����������������������");
			}
		}
		/*
		 * ѭ������༶�ɼ�������-1ʱ���أ����ҳ����ֵ��
		 */
		System.out.println("�������һ���ɼ���");
		
		Scanner input=new Scanner(System.in);//while ����if.
        int max=-1;//������ֵ��
        int in=-1;//��������ֵ��
        int count=1;//����ɼ��Ĵ�����
        while(true)   {//��������ֵΪ������������������ȷ���������ٴν������
        in=input.nextInt();
       /*
        while(in!=-1) {//ѭ����Ϊ���ֵ������ֵ�Ƚϣ������м������жϵڼ������롣
                     	if(in>max) {max=in;}
                     	count++;System.out.println("�������"+count+"�γɼ���");
                     	in=input.nextInt();
                      }
         {System.out.println("��߷�Ϊ��"+max);}
		*/
		
		//ʹ��do,whileִ�С�ѭ�����ڴ������ڣ�������С�����ڡ�
   
     	 
    	 if(in>=0) {
    		 
		do {
			if(in>max) {max=in;}
			count++;
			System.out.println("�������"+count+"�γɼ���");
			in=input.nextInt();
		   }
		while(in!=-1);
		
		System.out.println("��߳ɼ�Ϊ��"+max);break;
    	            }
    	                     
    	 else {System.out.println("��������ȷ�ĳɼ���");}
    	 
		                 }
		
        /*
         * ���ӳ������⣬
         */
        
        int day=10;//�����ܹ��Ե�����
         int x=1,y=0;//x�ǵ�ʮ��ʣ�����ӣ�y����Ϊǰһ�����������
         while(day>0) {x=(x+1)*2;day--;y=x;}
         System.out.println("��һ��ժ������Ϊ"+y);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
          
	}

}
