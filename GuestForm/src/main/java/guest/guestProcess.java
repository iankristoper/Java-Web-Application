package guest;




import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;







@WebServlet("/guestProcess")
public class guestProcess extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		
		if (name != null && message != null && !name.isEmpty() && !message.isEmpty()) {
            String fullMessage = name + ": " + message;

            // Store messages in application scope
            List<String> messages = (List<String>) getServletContext().getAttribute("messages");
            
            if (messages == null) {
                messages = new ArrayList<>();
            }
            
            messages.add(fullMessage);
            getServletContext().setAttribute("messages", messages);
        }
		
		//redirect to the guestbook page
		response.sendRedirect("index.jsp");

	}

    

}





















