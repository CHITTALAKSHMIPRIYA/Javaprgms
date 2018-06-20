
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;



public class UpdatePassword {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String upassword=args[0];  //password going to be updated
		String regno=args[1];
		String givenpassword=args[2];  //password present in database

		//String cpassword=args[3];  //confirm the updated password
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		//checking confirm password to new password we are giving
	//if (cpassword.equals(upassword)) 
		//{
		//1.load the driver
		try {
			
			
			Driver driveRef=new Driver();
			DriverManager.registerDriver(driveRef);
			
			//2.get the db connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/bridgelabz";
			String user="root";
			String password="root";
		
			//3rd getConnection method with 3 string arguments
			con=DriverManager.getConnection(dbUrl,user,password);
			//4.issues the sql queries
			String query=" update student1_otherinfo "
					+" set password=? "+" where regno=? and password=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,upassword);
			pstmt.setInt(2,Integer.parseInt(regno));	
			pstmt.setString(3,givenpassword);
		//	pstmt.setString(4,cpassword );
			int count=pstmt.executeUpdate();
			//checking existing password with updated password
			if(count>0)
			{
				
				System.out.println("rows affected="+count);
				System.out.println("successfully updated the new password");
			}
			else
			{
				System.out.println(" error!!in updating the password ");
						System.out.println(" Either regno or password is incorrect");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try{
			if(con!=null)
			{
				con.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			
			
		}
			catch (SQLException e)
			{
			e.printStackTrace();
			}
			
			}
		}
}
