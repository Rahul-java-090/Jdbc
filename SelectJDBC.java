package com.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectJDBC {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","root");
	System.out.println("connection estb...");
	
	String q="select * from table1";
	
	PreparedStatement pstmt=con.prepareStatement(q);
	
   ResultSet res = pstmt.executeQuery();
   
   while(res.next()==true)
   {
	   String fname=res.getString(1);
	   String lname=res.getString(2);
	   String hobbie=res.getString(3);
	   int id=res.getInt(4);
	   
	   System.out.println("\n table1 contains: " );
	   System.out.println("\n fname-- "+fname+"\n lname-- "+lname+"\n hobbie-- "+hobbie+"\n id-"+id );
	   
   }
    
    System.out.println("done.....");
    
    con.close();
}
}
