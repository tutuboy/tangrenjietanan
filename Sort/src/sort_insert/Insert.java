package sort_insert;
/**
 * ����ʽ����
 * @author Administrator
 *1��ȡ��һ��Ԫ�أ�������ǰ�档��Ϊ��һ���У��������Ϊ�ڶ����С�
 *2���ӵڶ�����ȡ��һ��Ԫ�أ������һ���У�����������λ�á�
 *3���ӵڶ����У���ȡһ���������һ���У�����������λ�á�
 *4���������ƣ�ֱ�����һ������
 *
 *
 */
public class Insert {

		public static void main(String []args){
		int arr[]={23,15,-13,62,5,-23,0,17};
		
			for(int i=1;i<arr.length;i++){
				int insertVal=arr[i];
				//insertVal׼����ǰһ�����Ƚ�
				int index=i-1;
				while(index>=0&&insertVal<arr[index]){
					//����arr[index]����ƶ�һλ
					arr[index+1]=arr[index];
					//��index��ǰ�ƶ�һλ
					index--;
				}
				//��insertVal���뵽�ʵ�λ��
				arr[index+1]=insertVal;
			}
			//��������
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}	
		}
	}
