package com.action;

import java.util.Scanner;

import com.biz.Booksave;

public class Welcome {
	Scanner input=new Scanner(System.in);
	Booksave bs=new Booksave();
	Inputbook ib=new Inputbook();
	public void welC(){
		while(true){
		System.out.println("请选择要作何操作：");
		System.out.println("添加书本信息请选----------1.");
		System.out.println("修改书本信息请选----------2.");
		System.out.println("删除书本信息请选----------3.");
		System.out.println("查询单个信息请选----------4.");
		System.out.println("全部书本信息请选----------5.");
		int in=input.nextInt();
		switch (in) {
		case 1:
			
			bs.add(ib.inputB());

			break;
		case 2:
			System.out.println("请输入书号：");
			String s=input.next();
			bs.update(s);

			break;
		case 3:
			System.out.println("请输入书号：");
			s=input.next();
			bs.delete(s);

			break;
		case 4:
			System.out.println("请输入书号：");
			s=input.next();
			bs.findone(s);

			break;
		case 5:
			bs.findall();

			break;

		}
		
	}
		
	}
	

}
