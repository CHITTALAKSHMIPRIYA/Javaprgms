
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class BatchUpdate {

	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			  String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  con.setAutoCommit(false);
			  stmt=con.createStatement();
			  String SQL = "update students_info set firstname='remo', lastname='burnwal' where regno=1";
			  stmt.addBatch(SQL);
			  SQL = "update students_info set firstname='paluvadi', lastname='prathyu' where regno=2";
			  stmt.addBatch(SQL);
			  stmt.executeBatch();
			  con.commit();
			  }
		catch(SQLException | ClassNotFoundException e)
		{
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // rollBack in case of an exception
			e.printStackTrace();
			}
		finally {
			
				        if (con!= null)
							try {
								con.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} // finally close the connection
			
				    }
	}
}