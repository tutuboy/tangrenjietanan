package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	
	Jdbc jd=new Jdbc();
	Connection con=jd.jdbc();
	public int delete(String st){
		int rows=0;
		String sql="DELETE FROM MEMBER WHERE MEMBERNAME=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, st);
			rows=ps.executeUpdate();
			ps.close();
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
		
		
	}
	

}
