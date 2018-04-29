package com.action;

import java.util.Scanner;

import com.bean.Book;

public class Inputbook {
	Scanner input=new Scanner(System.in);
	public Book inputB(){
		Book bo=new Book();
		System.out.println("请输入书名：");
		bo.setName(input.next());
		System.out.println("请输入作者：");
		bo.setAuther(input.next());
		System.out.println("请输入价格：");
		bo.setPrice(input.next());
		return bo;
	}

}
