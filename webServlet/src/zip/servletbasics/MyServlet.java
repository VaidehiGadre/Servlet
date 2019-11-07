package servletbasics;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/MyServlet") //this is displayed in url for hiding actual class name i.e. this name is displayed in place of class name. either annotation or xml needs to be used. if both are used then xml version is used. 
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //telling browser to send response in either html or display on browser
		
		PrintWriter out = response.getWriter(); //getWriter() method in httpresponse
		out.println("<html>"); //prints on browser
		out.println("<body>");
		out.println("<h1>Welcome to my first servlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
