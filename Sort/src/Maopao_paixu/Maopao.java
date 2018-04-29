 package Maopao_paixu;

public class Maopao {

	/**
	 * @param args
	 * 冒泡排序
	 * 
	 */
	
	public static void maoPaosort(int[] arr){
		
		
		for(int a=0;a<arr.length-1;a++){//外层控制轮数
			for(int b=0;b<arr.length-a-1;b++){//内层控制每轮比较的次数。
				if(arr[b]>arr[b+1]){//数组下标用，控制次数
					int temporary=arr[b];//当满足条件时，相互换位置，把最大的放到最后。
					arr[b]=arr[b+1];     //每轮比较，都会减少一次，只比较最前面的，这样最后的一位不会做比较。
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
