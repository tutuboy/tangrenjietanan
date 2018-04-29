package com.biz;

import java.util.List;

import org.dom4j.Element;

import com.action.Inputbook;
import com.bean.Book;
import com.bean.IBook;
import com.util.Bookutil;

public class Booksave extends Book implements IBook {
	
	
	Bookutil bu=new Bookutil();
	Element rootele=bu.bookU();
	public static int index=1;
	public static int sid;
	

	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		
		Element stuele=rootele.element("book");
		List<Element> stulist=rootele.elements();
	    if(stuele==null){
		   b.setSid(String.valueOf(index));
	     }else{
		   
		     int length=stulist.size();
	         String temp=stulist.get(length-1).attributeValue("sid");
	         sid=Integer.parseInt(temp); 
	         b.setSid(String.valueOf(sid+1));
	       
	   
	   }

	       Element stele=rootele.addElement("book");
		   stele.addAttribute("sid", b.getSid());
		   stele.addElement("name").setText(b.getName());
		   stele.addElement("auther").setText(b.getAuther());
		   stele.addElement("price").setText(b.getPrice());
		   bu.bookSS();
		   System.out.println("添加成功。");

	}

	@Override
	public void update(String s) {
		// TODO Auto-generated method stub
		List<Element> booklist=rootele.elements();
		int index=-1;
		for (Element bookele : booklist) {
			if(bookele.attributeValue("sid").equalsIgnoreCase(s)){
				Inputbook ib=new Inputbook();	
				Book b=ib.inputB();
				bookele.element("name").setText(b.getName());
				bookele.element("auther").setText(b.getAuther());
				bookele.element("price").setText(b.getPrice());
				index=1;
				break;
			}
		}
		if(index==1){
		bu.bookSS();
		System.out.println("修改成功。");
		}
		if(index==-1){System.out.println("没有这本书。");}

	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		List<Element> booklist=rootele.elements();
		int index=-1;
		for (Element bookele : booklist) {
			if(bookele.attributeValue("sid").equalsIgnoreCase(s)){
				rootele.remove(bookele);
				index=1;
				
				break;
			}
		}
		
		if(index==1){
			bu.bookSS();
			System.out.println("删除成功。");
			}
			if(index==-1){System.out.println("没有这本书。");}

	}

	@Override
	public void findone(String s) {
		// TODO Auto-generated method stub
		List<Element> booklist=rootele.elements();
		int index=-1;
		for (Element bookele : booklist) {
			if(bookele.attributeValue("sid").equalsIgnoreCase(s)){
				System.out.print("书号："+bookele.attributeValue("sid")+"\t");
				System.out.print("作者:"+bookele.elementText("auther")+"\t");
				System.out.print("价格:"+bookele.elementText("price")+"\t");
				index=1;
				break;
				
			}
		}
		
			if(index==-1){System.out.println("没有这本书。");}

	}

	@Override
	public void findall() {
		// TODO Auto-generated method stub
		List<Element> booklist=rootele.elements();
		for (Element bookele : booklist) {
			System.out.print("书号："+bookele.attributeValue("sid")+"\t");
			System.out.print("作者:"+bookele.elementText("auther")+"\t");
			System.out.println("价格:"+bookele.elementText("price")+"\t");
		}

	}

}
