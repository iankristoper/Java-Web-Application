package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Hellosss")
public class Hello extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	@Override 
	public void init() throws ServletException {
		System.out.println("Servlet has been initialized");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter display = response.getWriter();
		
		display.println("<html><body><h1>Hello, World!</h1></body></html>");
		display.close();
	}
	
	@Override 
	public void destroy() {
		System.out.println("Hello servlet has been destroyed");
	}
 

}















