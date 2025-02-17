package guest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;





@WebServlet("/counter")
public class counter extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	
    	ServletContext context = getServletContext();
    	Integer count = (Integer) context.getAttribute("pageCount");
    	
    	if(count == null) {
    		count = 1;
    	} else {
    		++count;
    	}
    	
    	out.println("<h1>Page accessed " + count + " times.</h1>");
    	
    	
    }
	
}














