package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	
	public Connection jdbc(){
		Connection co=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 co=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8","root","mysql");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co;
		
	}

}
