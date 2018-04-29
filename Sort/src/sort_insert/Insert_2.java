package sort_insert;

public class Insert_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,5,4,3,2,1};
		//第一个循环取出数组0标以后的元素。让元素站起来。
		for(int a=1;a<arr.length;a++){
			int insertnum=arr[a];
			int index=a-1;//index控制最多比较次数。·
			//把取出的元素与前面的，排好序列的数比较。
			while(index>=0&&insertnum<arr[index]){
				arr[index+1]=arr[index];//下标控制循环次数。
				index--;

			}
			arr[index+1]=insertnum;
	
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
