package com.test;

import java.lang.reflect.Array;

public class ArrayTest2 {
	public static void main(String[] args) throws Exception {
		// ����һ������10*15��Ԫ�ص���������
		int dims[] = { 10, 15};
		Object arr = Array.newInstance(int.class, dims);
		// ��arr[5][8]��ֵ
		Object arr5 = Array.get(arr, 5);
		
		Array.set(arr5, 8, 30);
		// ȡ��arr[5][8]ֵ�����
		Object elem = Array.get(arr5, 8);
		System.out.println(elem);
	}
}
