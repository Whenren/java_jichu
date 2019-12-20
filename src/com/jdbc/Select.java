package com.jdbc;

import java.sql.*;


public class Select {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		
		Statement yuju=conn.createStatement();
		
		String sql="select * from tb_user";
		
		ResultSet rs= yuju.executeQuery(sql);
		while(rs.next()) {
			String xingming=rs.getString("name");
			System.out.println(xingming);
		}

	}

}
