
package com.bridgelabz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transaction {

	
	public static void main(String[] args) {
	   Connection con=null;
	   PreparedStatement pstmt=null;
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
			 String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  con.setAutoCommit(false);//setting auto-commit off
			  String query="insert into students_info values(?,?,?)";
			  pstmt=con.prepareStatement(query);
			  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			  while(true){  
				  
				  System.out.println("enter regno");  
				  String s1=br.readLine();  
				  int regno=Integer.parseInt(s1);  
				    
				  System.out.println("enter firstname");  
				  String firstname=br.readLine();  
				    
				  System.out.println("enter lastname");  
				  String lastname=br.readLine();  
				  
				    
				  pstmt.setInt(1,regno);  
				  pstmt.setString(2,firstname);  
				  pstmt.setString(3,lastname);  
				  pstmt.executeUpdate();  
				    
				  System.out.println("commit/rollback");  
				  String answer=br.readLine();  
				  if(answer.equals("commit")){  
				  con.commit();  
				  }  
				  if(answer.equals("rollback")){  
				  con.rollback();  
				  }  
				    
				    
				  System.out.println("Want to add more records y/n");  
				  String ans=br.readLine();  
				  if(ans.equals("n")){  
				  break;  
				  }  
				    
				  }  
				  con.commit();  
				  System.out.println("record successfully saved");  
				    
				  con.close();//before closing connection commit() is called  
				  }catch(Exception e){System.out.println(e);}  
				    
	   }

	}


