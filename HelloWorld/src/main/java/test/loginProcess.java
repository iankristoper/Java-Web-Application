package test;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.http.HttpSession;





@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//hard coded credentials for testing 
		if("ian".equals(username) && "admin".equals(password)) {
			
			//create a session for the user
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			
			//redirect to the welcome page 
			response.sendRedirect("welcome.jsp");
		} else {
			//redirect back to the login page 
			response.sendRedirect("login.html");
		}
	}

}
