
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
public class StatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		  Statement stmt=null;
		 // ResultSet rs=null;
		  try {
			  Driver driverRef=new Driver();
			  DriverManager.registerDriver(driverRef);
			  String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  String query="insert into students_info"+ 
			             " values(10,'mani','chitta')";
			  stmt=con.createStatement();
			  int count=stmt.executeUpdate(query);
			
			  System.out.println("rows affected="+count);
		  }
		  catch(SQLException e)
		  {
			  e.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(con!=null)
				  {
					  con.close();
				  }
				  if(stmt!=null)
				  {
					  stmt.close();
				  }
				  
				  
			  }
			  catch(SQLException e)
			  {
				  e.printStackTrace();
			  }
			  
		  }

	}
	}

