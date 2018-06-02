package com.entity;

public class Test {
	
	public static void main(String[] args) {
		WebService w=new WebService();
		String str=w.getWebPort().sayHello("world");
		System.out.println(str);
	}

}
