package com.abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		System.out.println("connected");

		String q="update table1 set fname=?,lname=?,hobbie=? where id=?";

				
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter new fname: ");
		String fname= br.readLine();

		System.out.println("Enter new lname: ");
		String lname=br.readLine();
		
		System.out.println("Enter new hobbie: ");
		String hobbie=br.readLine();

		System.out.println("id:");
		int id=Integer.parseInt(br.readLine());
		
		
		
		PreparedStatement pstmt=con.prepareStatement(q);
		
		pstmt.setString(1,fname);
		pstmt.setString(2,lname);
		pstmt.setString(3,hobbie);

		pstmt.setInt(4,id);
		
		
		pstmt.executeUpdate();
		System.out.println("RECORD INSERTED SUCCESSFULLY");
		
		con.close();
	}

}
