package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.entity.IStudent;
import com.entity.Student;

public class Studentsave  implements IStudent {

	
	SAXReader sr=new SAXReader();
	Scanner input=new Scanner(System.in);
	public static int index=1003;
	public void add(Student s) {
		// TODO Auto-generated method stub
		try {
			String st=String.valueOf(index);
			Document doc=sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			Element stuele=rootele.addElement("student");
			stuele.addAttribute("sid", st);
			stuele.addElement("name").setText(s.getName());
			stuele.addElement("age").setText(s.getAge());
			Element addrele=stuele.addElement("address");
			addrele.addElement("old").setText(s.getOldadd());
			addrele.addElement("new").setText(s.getNewadd());
			
			FileOutputStream fos=new FileOutputStream(new File("Student.xml"));
			OutputFormat of=OutputFormat.createPrettyPrint();
			XMLWriter xw=new XMLWriter(fos,of);
			
			xw.write(doc);
			fos.close();
			index++;
			System.out.println("��ӳɹ���");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
		String inst=input.next();
		Inputstu instu=new Inputstu();
		Student st=instu.inputStu();
		Document doc;
		try {
			doc = sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			List<Element> stulist=rootele.elements();
			for (Element el : stulist) {
				if(el.attributeValue("sid").equals(inst)){
					
					//instu.inputStu();
					el.element("name").setText(st.getName());
					el.element("age").setText(st.getAge());
					Element secele=el.element("address");
					secele.element("old").setText(st.getOldadd());
					secele.element("new").setText(st.getNewadd());
					
					break;
	
				}
				
			}
			FileOutputStream fos=new FileOutputStream(new File("Student.xml"));
			OutputFormat of=OutputFormat.createPrettyPrint();
			XMLWriter xm=new XMLWriter(fos,of);
			xm.write(doc);
			fos.close();
			System.out.println("�޸ĳɹ���");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫɾ����ѧ��ѧ�ţ�");
		String inst=input.next();
		Document doc;
		try {
			doc = sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			List<Element> stuele=rootele.elements();
			for (Element el : stuele) {
				if(el.attributeValue("sid").equalsIgnoreCase(inst)){
					rootele.remove(el);
				}
			}
			FileOutputStream fos=new FileOutputStream(new File("Student.xml"));
			OutputFormat of=OutputFormat.createPrettyPrint();
			XMLWriter xm=new XMLWriter(fos,of);
			xm.write(doc);
			fos.close();
			System.out.println("ɾ���ɹ���");
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public void findone() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ����ѧ���ı�ţ�");
		String inst=input.next();
		Document doc;
		try {
			doc = sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			List<Element> stulist=rootele.elements();
			for (Element stuele : stulist) {
				if(stuele.attributeValue("sid").equalsIgnoreCase(inst)){
					System.out.print("sid:"+inst+"\t");
					System.out.print(stuele.getName()+":"+stuele.getText().trim()+"\t");
					Iterator stuit=stuele.elementIterator();
					while(stuit.hasNext()){
						Element secele=(Element) stuit.next();
						System.out.print(secele.getName()+":"+secele.getText().trim()+"\t");
						Iterator thirdit=secele.elementIterator();
						while(thirdit.hasNext()){
							Element thirdele=(Element) thirdit.next();
							System.out.print(thirdele.getName()+":"+thirdele.getText()+"\t");
							
						}
					}
					
					
				}
			}
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void findall(){
		Document doc;
		try {
			doc = sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			Iterator rootit=rootele.elementIterator();
			
			while(rootit.hasNext()){
				Element stuele=(Element) rootit.next();
				System.out.print("ѧ�ţ�"+stuele.attributeValue("sid"));
				System.out.print("\t������"+stuele.elementText("name")+"\t���䣺"+stuele.elementText("age")+"\t");
				Iterator stuit=stuele.elementIterator();
				while(stuit.hasNext()){
					Element secele=(Element) stuit.next();
					if(secele.elementText("old")!=null){
					System.out.println("�ɵ�ַ��"+secele.elementText("old")+"\t�µ�ַ��"+secele.elementText("new"));}
				}
			}
				
			
			
			
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}


	/*public void findall() {
		// TODO Auto-generated method stub
		Document doc;
		try {
			doc = sr.read(new File("Student.xml"));
			Element rootele=doc.getRootElement();
			f(rootele);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void f(Element e){
		System.out.println(e.getName()+"\t"+e.getText().trim()+"\t");
		
		List<Attribute> att=e.attributes();
		for (Attribute a : att) {
			String s=a.getName();
			String st=a.getText();
			System.out.println(s+"\t"+st+"\t");
			
		}
		List<Element> ele=e.elements();
		for (Element el : ele) {
			f(el);
		}*/
		
		
		
		
		
		
		
	

}
