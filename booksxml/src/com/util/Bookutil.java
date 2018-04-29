package com.util;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Bookutil {
	Document doc;
	public Element bookU(){
		SAXReader sr=new SAXReader();
		Element rootele = null;
		
		try {
			 doc=sr.read(new File("Books.xml"));
			 rootele=doc.getRootElement();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rootele;
		
		
	}
	public void bookSS(){
		try {
			FileOutputStream fos=new FileOutputStream(new File("Books.xml"));
			OutputFormat of=OutputFormat.createPrettyPrint();
			XMLWriter xm=new XMLWriter(fos,of);
			xm.write(doc);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}
