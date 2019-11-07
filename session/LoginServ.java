package session;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("pass");
		String location=request.getParameter("location");
		if("jack".equalsIgnoreCase(username)&&"rose".equalsIgnoreCase(password)){
			Cookie cookie1=new Cookie("user",username);
			Cookie cookie2=new Cookie("location",location);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.sendRedirect("Inbox");
		}
	}

}
