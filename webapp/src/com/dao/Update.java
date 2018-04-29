package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Member;

public class Update {
	Jdbc jd=new Jdbc();
	Connection con=jd.jdbc();
	public static String stri="";
	public String findI(String st){
		String str=null;
		String sql="SELECT MEMBERID FROM MEMBER WHERE MEMBERNAME=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, st);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){ 
				str=rs.getString(1);
				stri=str;
				}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return str;
		
	}
	
	public void upD(Member m){
		String sql="UPDATE MEMBER SET MEMBERNAME=?,AGE=?,SEX=?,INTEREST=? WHERE MEMBERID=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setInt(2, m.getAge());
			ps.setInt(3, m.getSex());
			ps.setString(4, m.getInterest());
			ps.setString(5, m.getId());
			int rows=ps.executeUpdate();
			ps.close();
			con.close();
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
