// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
 
   

public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	String emailid=request.getParameter("emailid");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><body>");  
	out.println("Welcome to servlet");
	out.print(emailid);
	out.println("</body></html>");  
	out.println("Hello");
}
   public void destroy() {
      // do nothing.
   }
}
