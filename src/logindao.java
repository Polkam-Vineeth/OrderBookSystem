package com.login.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logindao {
	
	String url="jdbc:mysql://localhost:3306/sys";
	String username ="root";
	String password ="Wearein@123";
	public boolean check(String uname,String pass) throws ClassNotFoundException, SQLException
	{
		String sql="select * from login where uname=? and pass=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,uname);
		st.setString(2,pass);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		
		return false;
	}
	public boolean insert(String uname,String pass) throws ClassNotFoundException, SQLException
	{
		String sql="insert into login values(?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,uname);
		st.setString(2,pass);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		
		return false;
	}

}
