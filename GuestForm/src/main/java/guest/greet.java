package guest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;






@WebServlet("/greet")
public class greet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // Setting response content type
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name"); // Retrieving user input
        
        out.println("<h1>Hello, " + name + "!</h1>");
    }

}
















