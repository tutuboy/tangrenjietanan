package com.action;

import java.util.Scanner;

import com.biz.Booksave;

public class Welcome {
	Scanner input=new Scanner(System.in);
	Booksave bs=new Booksave();
	Inputbook ib=new Inputbook();
	public void welC(){
		while(true){
		System.out.println("��ѡ��Ҫ���β�����");
		System.out.println("����鱾��Ϣ��ѡ----------1.");
		System.out.println("�޸��鱾��Ϣ��ѡ----------2.");
		System.out.println("ɾ���鱾��Ϣ��ѡ----------3.");
		System.out.println("��ѯ������Ϣ��ѡ----------4.");
		System.out.println("ȫ���鱾��Ϣ��ѡ----------5.");
		int in=input.nextInt();
		switch (in) {
		case 1:
			
			bs.add(ib.inputB());

			break;
		case 2:
			System.out.println("��������ţ�");
			String s=input.next();
			bs.update(s);

			break;
		case 3:
			System.out.println("��������ţ�");
			s=input.next();
			bs.delete(s);

			break;
		case 4:
			System.out.println("��������ţ�");
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
