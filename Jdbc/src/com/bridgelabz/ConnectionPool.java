
package com.bridgelabz;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class ConnectionPool {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSource ds=null;
		ds=DataSourceFactory.getMySQLDataSource();
		Connection con=null;
		Statement stmt=null;
		String query="insert into bridgelabz.students_info values(18,'cgh','dhgfh')";
		try {
			con=ds.getConnection();
			stmt=con.createStatement();
			stmt.executeUpdate(query);
		}
		 catch(SQLException e)
		  {
			  e.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(stmt!=null)
				  {
					  stmt.close();
				  }
				  if(con!=null)
				  {
					  con.close();
				  }
				 
				  
			  }
			  catch(SQLException e)
			  {
				  e.printStackTrace();
			  }
			  
		  }


	}

}
