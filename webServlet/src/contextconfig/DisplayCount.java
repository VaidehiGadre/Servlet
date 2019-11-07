package contextconfig;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayCount")
public class DisplayCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	
	public void init(ServletConfig config) throws ServletException{
		
    	context=config.getServletContext();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String count=context.getAttribute("count").toString();

		System.out.println(count);
		out.println("<html><head>");
		out.println("<title>Display Count</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("The site was visited "+count+" times.");
		out.println("</body>");
		out.println("</html>");
		context.removeAttribute("count");
	}

}
