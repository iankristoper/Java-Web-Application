package test;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




@WebServlet("/calculate")
public class CalculatorProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			//retrieving input values from the form
			double num1 = Double.parseDouble(request.getParameter("num1"));
			double num2 = Double.parseDouble(request.getParameter("num2"));
			
			String operation = request.getParameter("operation");
			
			double result = 0;
			String operationSymbol = "";
			
			//performing the selected operation 
			switch(operation) {
			
				case "add":
					result = num1 + num2;
					operationSymbol = "+";
					break;
					
				case "subtract":
					result = num1 - num2;
					operationSymbol = "-";
					break;
					
				case "multiply":
					result = num1 * num2;
					operationSymbol = "*";
					break;
					
				case "divide":
					try {
						result = num1 / num2;
						operationSymbol = "/";
					} catch(Exception e){
						out.println(e.getMessage());
					}			
					break;
					
				default:
					out.println("<h3>Error: Invalid operation selected.</h3>");
					return;		
			}
			
			// Displaying the result
            out.println("<h2>Calculation Result:</h2>");
            out.println("<p>" + num1 + " " + operationSymbol + " " + num2 + " = <strong>" + result + "</strong></p>");
            out.println("<br><a href='calculator.html'>Go back</a>");	
			
		} catch (NumberFormatException e) {
			out.println("<h3>Error: Please enter valid numbers.</h3>");
            out.println("<br><a href='index.html'>Go back</a>");
		}	 			
	} 
}































