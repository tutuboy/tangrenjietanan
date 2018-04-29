package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Member;

public class Save {
	Jdbc jd=new Jdbc();
	Connection con=jd.jdbc();
	public int saveM(Member m){
		int rows=0;
		String sql="INSERT INTO MEMBER(MEMBERID,MEMBERNAME,AGE,SEX,INTEREST) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setInt(3, m.getAge());
			ps.setInt(4, m.getSex());
			ps.setString(5, m.getInterest());
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
