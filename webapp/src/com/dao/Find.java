package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Member;

public class Find {
	
	Jdbc jd=new Jdbc();
	Connection con=jd.jdbc();
	public Member findO(String s){
		Member m=new Member();
		String sql="SELECT * FROM MEMBER WHERE MEMBERNAME=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, s);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				m.setId(rs.getString(1));
				m.setName(rs.getString(2));
				m.setAge(rs.getInt(3));
				m.setSex(rs.getInt(4));
				m.setInterest(rs.getString(5));

			}
			ps.close();
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

}
