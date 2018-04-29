package com.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sockettest {
	Scanner input=new Scanner(System.in);
	public void socketT(String s,int a){
		while(true){
		try {
			Socket so=new Socket(s,a);
			System.out.println("请输入要向服务端发送的信息：");
			System.out.println(Thread.currentThread().getName()+"在与服务器通信。");
			String st=input.next();
		    OutputStream os=so.getOutputStream();
		    os.write(st.getBytes("utf-8"));
		    so.shutdownOutput();
		    
		    InputStream is=so.getInputStream();
		    BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
		    String str= br.readLine();
		    System.out.println(str);
		    so.shutdownInput();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

}
