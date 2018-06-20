
package com.bridgelabz;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) {
		String regno=req.getParameter("regno");
		String password=req.getParameter("password");
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			String sql="select * from students_info si,guardian_info gi,student1_otherinfo so "
					+ " where si.regno=gi.regno and si.regno=so.regno and si.regno=? and so.password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(regno));
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			if(rs.next())
			{
				out.print("<h1>Credentials are valid</h1>");
			}
			else
			{
				out.print("<h1>Invalid Credentials </h1>");
			}
		}
			 catch(Exception e)
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
		   		  if(pstmt!=null)
		   		  {
		   			  pstmt.close();
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
