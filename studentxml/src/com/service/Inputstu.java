package com.service;

import java.util.Scanner;

import com.entity.Student;

public class Inputstu {
	Scanner input=new Scanner(System.in);
	
	public Student inputStu(){
		Student st=new Student();
		
		System.out.println("������ѧ��������");
		st.setName(input.next());
		System.out.println("������ѧ�����䣺");
		st.setAge(input.next());
		System.out.println("������ѧ����סַ��");
		st.setOldadd(input.next());
		System.out.println("������ѧ����סַ��");
		st.setNewadd(input.next());
		return st;
		
	}
	

}
