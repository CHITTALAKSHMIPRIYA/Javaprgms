
package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		//java code to generate current date and time
		Date dateRef=new Date();
		String currDate=dateRef.toString();
	
		
		//Send HTML Response to browser via web server
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		out.print("current date and time is:");
		out.print("<font color=\"red\">" );
		out.print(currDate);
		out.print("</font>");
		out.print("<BR><BR>");
		
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

		
	}

}
