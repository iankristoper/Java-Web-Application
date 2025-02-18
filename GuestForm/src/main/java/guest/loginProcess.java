package guest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;







@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("admin".equals(username) && "admin".equals(password)) {  //dummy authentication
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			out.println("<h1>Welcome, " + username + "!</h1>");
            out.println("<a href='logout'>Logout</a>");
		} else {
			out.println("<h1>Invalid credentials</h1>");
            out.println("<a href='index.html'>Try Again</a>");
		}
	}
    

	
}













