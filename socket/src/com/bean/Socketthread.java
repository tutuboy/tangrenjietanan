package com.bean;

import java.net.Socket;

public class Socketthread extends Thread {

	private String s;
	private int a;
	
	


	public Socketthread(String s, int a) {
		super();
		this.s = s;
		this.a = a;
	}




	@Override
	public void run() {
		Sockettest ss=new Sockettest();
		ss.socketT(s,a);
		
	}
	
	
}
