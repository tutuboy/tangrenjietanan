package com.service;

import java.util.Scanner;

public class welcome {
	
	Scanner input=new Scanner(System.in);
	Studentsave stusave=new Studentsave();
	Inputstu inp=new Inputstu();
	public void welC(){
		
		while(true){
		System.out.println("请输入要做什么操作：");
		System.out.println("添加学生信息请选择---------1.");
		System.out.println("修改学生信息请选择---------2.");
		System.out.println("删除学生信息请选择---------3.");
		System.out.println("查询学生信息请选择---------4.");
		System.out.println("查询全部信息请选择---------5.");
		int in=input.nextInt();
		switch(in){
		case 1:
			
			stusave.add(inp.inputStu());
			break;
		case 2:
			stusave.update();
			break;
		case 3:
			stusave.delete();
			break;
		case 4:
			stusave.findone();
			break;
		case 5:
			stusave.findall();
			break;
			
		
		
		}
		
	}
		
	}
	

}
