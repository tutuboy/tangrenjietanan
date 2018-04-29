package com.test;

import java.lang.reflect.Array;

public class ArrayTest2 {
	public static void main(String[] args) throws Exception {
		// 创建一个含有10*15个元素的整型数组
		int dims[] = { 10, 15};
		Object arr = Array.newInstance(int.class, dims);
		// 给arr[5][8]赋值
		Object arr5 = Array.get(arr, 5);
		
		Array.set(arr5, 8, 30);
		// 取出arr[5][8]值并输出
		Object elem = Array.get(arr5, 8);
		System.out.println(elem);
	}
}
