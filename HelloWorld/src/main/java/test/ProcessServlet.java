package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;





@WebServlet("/processForm")
public class ProcessServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	@Override 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//retrieve the data using the parameter names defined in the html form
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		//generate simple html reponse displaying the submitted data 
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head>");
		writer.println("<title>Form Processed</title>");
		writer.println("<h1>Form Submitted Successfully!</h1>");
		writer.println("<p>Name: " + name + "</p>");
		writer.println("<p>Email: " + email + "</p>");
		writer.println("</body></html>");
		
		writer.close(); 
		
		
		
	}
       


}
