package com.service;

import java.util.Scanner;

import com.entity.Student;

public class Inputstu {
	Scanner input=new Scanner(System.in);
	
	public Student inputStu(){
		Student st=new Student();
		
		System.out.println("请输入学生姓名：");
		st.setName(input.next());
		System.out.println("请输入学生年龄：");
		st.setAge(input.next());
		System.out.println("请输入学生旧住址：");
		st.setOldadd(input.next());
		System.out.println("请输入学生新住址：");
		st.setNewadd(input.next());
		return st;
		
	}
	

}
