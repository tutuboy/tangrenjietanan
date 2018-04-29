package com.test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.bean.Student;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cl=Student.class;
			
			Object ob=cl.newInstance();
			
			
			Field f=cl.getDeclaredField("sid");
			
			f.setAccessible(true);
			f.set(ob, 1001);
			System.out.println(ob);
			
			Field fi=cl.getDeclaredField("name");
			fi.setAccessible(true);
			fi.set(ob, "yu");
			System.out.println(ob);
			
			Field fie=cl.getDeclaredField("score");
			fie.setAccessible(true);
			fie.set(ob, 90);
			System.out.println(ob);
			
			Constructor c=cl.getConstructor(String.class,int.class,int.class);
			Object o=c.newInstance("li",1002,100);
			System.out.println(o);
			
			Method m=cl.getDeclaredMethod("add",int.class,int.class);
			Object objec=m.invoke(ob,1,2);
			System.out.println(objec);
			
			Method me=cl.getDeclaredMethod("show");
			me.invoke(ob);
			
			String[] ar=(String[]) Array.newInstance(String.class, 5);
			Array.set(ar, 0, "yu");
			Array.set(ar, 1, "li");
			
			System.out.println(Arrays.toString(ar));
			
		
			
			
			
	
			
		
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
