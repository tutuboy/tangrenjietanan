package com.service;

import java.util.Scanner;

public class welcome {
	
	Scanner input=new Scanner(System.in);
	Studentsave stusave=new Studentsave();
	Inputstu inp=new Inputstu();
	public void welC(){
		
		while(true){
		System.out.println("������Ҫ��ʲô������");
		System.out.println("���ѧ����Ϣ��ѡ��---------1.");
		System.out.println("�޸�ѧ����Ϣ��ѡ��---------2.");
		System.out.println("ɾ��ѧ����Ϣ��ѡ��---------3.");
		System.out.println("��ѯѧ����Ϣ��ѡ��---------4.");
		System.out.println("��ѯȫ����Ϣ��ѡ��---------5.");
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
