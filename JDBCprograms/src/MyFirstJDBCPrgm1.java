import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCPrgm1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String query=null;
		 Connection con=null;
	      Statement stmt=null;
	      ResultSet rs=null;
	      try
	      {
	    	  Driver driverRef=new Driver();
	    	  DriverManager.registerDriver(driverRef);
	    	  String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
	    	  con=DriverManager.getConnection(dbUrl);
	    	  query="create table emp(id int(10) primary key,firstname varchar(10),lastname varchar(10),mobile varchar(10))";
	    	  stmt=con.createStatement();
	    	rs=stmt.executeQuery(query);
	    	  while(rs.next()){
	    		  int regno=rs.getInt("regno");
	    		  String fnm=rs.getString("firstname");
	    		  String mnm=rs.getString("middlename");
	    		  String lnm=rs.getString("lastname");
	    		  System.out.println("regno="+regno);
	    		  System.out.println("firstname="+fnm);
	    		  System.out.println("middlename="+mnm);
	    		  System.out.println("lastname="+lnm);
	    	  }
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
	    		  if(rs!=null)
	    		  {
	    			  rs.close();
	    		  }
	    	  }
	    	  catch(SQLException e)
	    	  {
	    		  e.printStackTrace();
	    		  
	    		  }
	    	  }
	      }
	}


