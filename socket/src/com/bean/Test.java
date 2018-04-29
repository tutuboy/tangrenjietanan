package com.bean;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socketthread s=new Socketthread("192.168.1.20",8999);
			s.setName("1");
			s.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Socketthread st=new Socketthread("192.168.1.20",8999);
		st.setName("2");
		st.start();

	}

}
