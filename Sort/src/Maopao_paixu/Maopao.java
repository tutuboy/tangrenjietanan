 package Maopao_paixu;

public class Maopao {

	/**
	 * @param args
	 * ð������
	 * 
	 */
	
	public static void maoPaosort(int[] arr){
		
		
		for(int a=0;a<arr.length-1;a++){//����������
			for(int b=0;b<arr.length-a-1;b++){//�ڲ����ÿ�ֱȽϵĴ�����
				if(arr[b]>arr[b+1]){//�����±��ã����ƴ���
					int temporary=arr[b];//����������ʱ���໥��λ�ã������ķŵ����
					arr[b]=arr[b+1];     //ÿ�ֱȽϣ��������һ�Σ�ֻ�Ƚ���ǰ��ģ���������һλ�������Ƚϡ�
					arr[b+1]=temporary;
				}
			}
		}
		for(int i:arr){
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={6,5,4,3,2};
		maoPaosort(input);
		

	}

}
