package servletcommunication;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		if("admin".equalsIgnoreCase(userName) && "admin".equals(password)){
			response.sendRedirect("SuccessServlet?user="+userName); //used to carry forward the name to next page
		} else{
			PrintWriter out=response.getWriter();
			out.println("<html><head>");
			out.println("<title>Login Page</title>");
			out.println("</head>");
			out.println("<body>");
			out.print("The entered credentials do not match.");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
