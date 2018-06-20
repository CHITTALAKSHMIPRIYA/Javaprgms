
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangePassword extends HttpServlet {
	RequestDispatcher dispatcher = null;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		// Get form data
		String regnoval = req.getParameter("regnum");
		String currPassVal = req.getParameter("currPass");
		String newPassVal = req.getParameter("newPass");
		String reNewPassVal = req.getParameter("reNewPass");
		StringBuffer sb = new StringBuffer();
		// Check New Password & Retype New Password is Same
		if (newPassVal.equals(reNewPassVal)) {
			// New Password = Retype New Password; Hence Update
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				// Load the driver
				Class.forName("com.mysql.jdbc.Driver");
				// 2. Get the DB Connection via Driver
				String dbUrl = "jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
				con = DriverManager.getConnection(dbUrl);
				// Issue SQL queries via connection
				String query = "update student1_otherinfo" + "set password=?" + "where regno=?";
				// +"and password=?";
				System.out.println("Query=" + query);
				pstmt = con.prepareStatement(query);
				System.out.println("completd");
				pstmt.setString(1, newPassVal);
				System.out.println("completd");
				pstmt.setInt(2, Integer.parseInt(regnoval));
				System.out.println("set values");
				// pstmt.setString(3, currPassVal);
				int count = pstmt.executeUpdate();
				System.out.println("completd");
				// process the results returned by sql queries
				sb.append("<html>");
				sb.append("<body>");
				if (count > 0) {
					sb.append("<font-color=\"green\">");
					sb.append("successfully changed password");
					sb.append("<\font>");
				} else {
					sb.append("<font-color=\"red\">");
					sb.append("reg no and password didn't match");
					sb.append("<\font>");

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 5. Close All JDBC Objects
				try {
					if (con != null) {
						con.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			sb.append("<font color=\"red\">");
			sb.append("New Password & Re-type New Password Doesn't Match !!!");
			sb.append("</font>");
		}

		sb.append("</body>");
		sb.append("</html>");

		// Send the response to Browser
		

		// dispatcher=req.getRequestDispatcher("header");
		// dispatcher.include(req, resp);

		out.println(sb.toString());

		dispatcher = req.getRequestDispatcher("changePassword.html");
		dispatcher.include(req, resp);

		// dispatcher=req.getRequestDispatcher("Footer.html");
		// dispatcher.include(req, resp);

	}// End of doPost
}// End of Class
