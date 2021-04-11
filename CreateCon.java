package com.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateCon {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/project";
		String username="root";
		String pwd="root";
		
		
		Connection con=DriverManager.getConnection(url, username, pwd);
		System.out.println("Connection estabilished....!");
		
		
		con.close();

		System.out.println("Connection terminated.....!");
		
	}

}
