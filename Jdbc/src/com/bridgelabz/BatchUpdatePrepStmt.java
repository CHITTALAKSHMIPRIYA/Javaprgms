
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdatePrepStmt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="update students_info set firstname=?,lastname=? where regno=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			  con=DriverManager.getConnection(dbUrl);
			  con.setAutoCommit(false);//setting auto-commit off
			  pstmt=con.prepareStatement(query);
			  pstmt.setInt(3,2);
			  pstmt.setString(1,"gowthami");
			  pstmt.setString(2,"devireddy");
			  pstmt.addBatch();
			  pstmt.setInt(3,3);
			  pstmt.setString(1,"gow");
			  pstmt.setString(2,"reddy");
			  pstmt.addBatch();
			  int[] count=pstmt.executeBatch();
			  System.out.println("rows affected:"+count);
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


