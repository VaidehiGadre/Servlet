package contextconfig;


import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String adminEmail;
	 public void init(ServletConfig config) throws ServletException{
		 adminEmail=config.getInitParameter("adminEmail");
	 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head>");
		out.println("<title>Config Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>The admin email is "+adminEmail+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
