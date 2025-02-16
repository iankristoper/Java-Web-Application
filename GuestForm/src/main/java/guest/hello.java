package guest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;







@WebServlet("/hello")
public class hello extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setContentType("text");
    	PrintWriter out = response.getWriter();
    	out.println("<h1>Hello, Servlet!</h1>");
    }
}










