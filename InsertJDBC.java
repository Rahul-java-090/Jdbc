package com.abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner scan=new Scanner(System.in);
		int sc=scan.nextInt();
		String url="jdbc:mysql://localhost:3306/project";
		String username="root";
		String password="root";
		String q="insert into job(id,name,salary) values(?,?,?)";

		Connection con=DriverManager.getConnection(url, username, password);
		
		
		System.out.println("connection estb");

		PreparedStatement pstmt=con.prepareStatement(q);

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter id:");
		int id=sc;

		System.out.println("enter name:");
		String name=br.readLine();

		System.out.println("enter salary:");
		int salary=sc;


		pstmt.executeUpdate();


		System.out.println("inserted");
		con.close();

	}


}
