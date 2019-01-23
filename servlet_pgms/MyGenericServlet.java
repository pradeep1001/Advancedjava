

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyGenericServlet
 */
@WebServlet("/MyGenericServlet")
public class MyGenericServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("I am in Generic Servlet");
		out.println("</body></html>");
	}
       
    

}
