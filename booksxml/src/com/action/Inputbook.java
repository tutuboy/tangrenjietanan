package com.action;

import java.util.Scanner;

import com.bean.Book;

public class Inputbook {
	Scanner input=new Scanner(System.in);
	public Book inputB(){
		Book bo=new Book();
		System.out.println("������������");
		bo.setName(input.next());
		System.out.println("���������ߣ�");
		bo.setAuther(input.next());
		System.out.println("������۸�");
		bo.setPrice(input.next());
		return bo;
	}

}
