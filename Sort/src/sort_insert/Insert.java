package sort_insert;
/**
 * 插入式排序。
 * @author Administrator
 *1，取出一个元素，放在最前面。做为第一序列，后面的做为第二序列。
 *2，从第二序列取出一个元素，放入第一序列，并插入排序位置。
 *3，从第二序列，再取一个，放入第一序列，并插入排序位置。
 *4，依次类推，直到最后一个数。
 *
 *
 */
public class Insert {

		public static void main(String []args){
		int arr[]={23,15,-13,62,5,-23,0,17};
		
			for(int i=1;i<arr.length;i++){
				int insertVal=arr[i];
				//insertVal准备和前一个数比较
				int index=i-1;
				while(index>=0&&insertVal<arr[index]){
					//将把arr[index]向后移动一位
					arr[index+1]=arr[index];
					//让index向前移动一位
					index--;
				}
				//将insertVal插入到适当位置
				arr[index+1]=insertVal;
			}
			//输出最后结果
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}	
		}
	}
