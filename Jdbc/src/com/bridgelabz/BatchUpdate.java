
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BatchUpdate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		Statement stmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			  String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  con.setAutoCommit(false);//setting auto-commit off
			  stmt=con.createStatement();
			  String SQL = "update students_info set firstname='rimmi', lastname='wal' where regno=1";
			  stmt.addBatch(SQL);
			  SQL = "update students_info set firstname='paluadi', lastname='prathyusha' where regno=2";
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
