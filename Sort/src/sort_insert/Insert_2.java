package sort_insert;

public class Insert_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,5,4,3,2,1};
		//��һ��ѭ��ȡ������0���Ժ��Ԫ�ء���Ԫ��վ������
		for(int a=1;a<arr.length;a++){
			int insertnum=arr[a];
			int index=a-1;//index�������Ƚϴ�������
			//��ȡ����Ԫ����ǰ��ģ��ź����е����Ƚϡ�
			while(index>=0&&insertnum<arr[index]){
				arr[index+1]=arr[index];//�±����ѭ��������
				index--;

			}
			arr[index+1]=insertnum;
	
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
