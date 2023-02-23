package com.mohs10.database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class User_info {
	
		
	@Test
    public void testDB () throws ClassNotFoundException, SQLException	
{		
	//Class.forName("com.mysql.jdbc.Driver");
	
	//System.out.println("Driver loaded");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","hARI@145");
	
	System.out.println("Connected to MySQL DB");
	
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery("select * from shows");
	while(rs.next())
	{
	String area=rs.getString("area");
	System.out.println(":Database record is "+area);
	
	String Movie=rs.getString("Movie");
	System.out.println(":Database record is "+Movie);

	}
}
}
