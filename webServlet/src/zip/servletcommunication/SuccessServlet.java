package servletcommunication;


import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String user=request.getParameter("user");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title>Success Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hi welcome" + user +"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
