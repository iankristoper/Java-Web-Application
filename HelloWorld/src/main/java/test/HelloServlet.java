package test;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;





@WebServlet("/pqrs") // Available at: http://localhost:8080/YourAppName/pqrs
public class HelloServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {                           
    	
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8"); // Ensure correct encoding
        PrintWriter pw = response.getWriter();
        
        pw.println("<!DOCTYPE html>");
        pw.println("<html><head><title>Servlet Test Form Ian Server</title></head><body>");
        pw.println("<h1>Welcome to Ian's Servlet Code</h1>");
        pw.println("<h2>Welcome to Ian's servlet Code</h2>");
        pw.println("</body></html>");
        
        
        pw.close(); // Close PrintWriter
    }
}

















