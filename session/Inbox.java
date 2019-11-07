package session;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		String userName=null;
		String location=null;
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("user")){
				userName=cookie.getValue();
			} else if(cookie.getName().equals("location")){
				location=cookie.getValue();
			}
		}
		
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title>Inbox</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1 style='margin-left:40%;'>Inbox</h1>");
		out.print("<h2>Welcome"+userName+"</h2>");
		out.print("<h2>Location"+location+"</h2>");
		out.print("<a href='SentItems'?user="+userName+"&location"+location+"'/>Sent Items</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
