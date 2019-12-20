package com.jdbc;


import java.sql.*;
public class test_coon {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		
		Statement yuju=conn.createStatement();
		
		String sql="UPDATE tb_user SET email='jack@qq.com' WHERE id=1";
		
		yuju.execute(sql);
		
	}

}
