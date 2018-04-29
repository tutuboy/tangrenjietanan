package Midcheck;

public class Check {

	/**二分法查找。
	 * @param args
	 */
	
	public static int Check(int[] arr,int num){
		int in=0;
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(arr[mid]!=num){
			if(arr[mid]<num){
				min=mid+1;
			}
			
			if(arr[mid]>num){
				max=mid-1;
			}
			mid=(min+max)/2;
			if(min>max){
				return -1;
			}

		}
		

		return mid;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={11,22,33,44,55};
		int c=Check(a,99);
		System.out.println(c+" "+a[c]);
		
		
		
		

	}

}
