
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddCourseServlet extends HttpServlet {
	RequestDispatcher dispatcher = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// To Send the response to Browser
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// dispatcher=req.getRequestDispatcher("header");
		// dispatcher.include(req, resp);

		out.println("<html>");
		out.println("<body>");

		// I. Get the Form Data  
		String courseIdVal = req.getParameter("courseId");
		String courseNmVal = req.getParameter("courseNm");
		String feeVal = req.getParameter("fee");
		String durationVal = req.getParameter("duration");
		String facultyVal = req.getParameter("faculty");
		System.out.println("taking request");

		/*
		 * II. Insert the above Form Data into bridgelabz DataBase
		 */
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. Load the Driver
			// Driver Class : com.mysql.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load driver");
			// 2. Get the DB Connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/bridgelabz?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			System.out.println("create connection");
			// 3. Issue SQL Queries via Connection
			String query = " insert into course_info " + "values(?, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(query);
			System.out.println("create platform");
			pstmt.setInt(1,Integer.parseInt(courseIdVal));
			pstmt.setString(2, courseNmVal);
			pstmt.setInt(3, Integer.parseInt(feeVal));
			pstmt.setString(4, durationVal);
			pstmt.setString(5, facultyVal);
			System.out.println("setting values");
			pstmt.executeUpdate();
			System.out.println("added successfully");
			// 4. Process the results returned by SQL Queries
			out.println("<font color=\"green\">");
			out.println("Successfully Added New Course ...");
			out.println("</font>");

		} catch (SQLException | ClassNotFoundException e) {
			out.println("<font color=\"red\">");
			out.println("Unable to Add New Course!!! ");
			out.println("<BR> Looks like the course " + courseNmVal + " with Course ID " + courseIdVal
					+ " already exists ...");
			out.println("<BR> Error is : ");
			out.println(e.getMessage());
			out.println("</font>");
		} finally {
			// 5. Close ALL JDBC Objects
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // End of outer try-catch

		out.println("</body>");
		out.println("</html>");

		dispatcher = req.getRequestDispatcher("AddCourse.html");
		dispatcher.include(req, resp);
	}

}
