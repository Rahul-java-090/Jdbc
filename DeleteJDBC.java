package com.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","root");
		System.out.println("dn");
		String q="delete from table1 where fname=?";

		PreparedStatement pstmt=con.prepareStatement(q);
		
		System.out.println("enter the fname for deletion of row");
		String fname=scan.nextLine();

		pstmt.setString(1, fname);
		pstmt.executeUpdate();
		
		System.out.println("deletion done");
		con.close();
	}
}