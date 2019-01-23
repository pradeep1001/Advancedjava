servlet code : 



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicServletDemo
 */
@WebServlet("/BasicServletDemo")
public class BasicServletDemo extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() 
	{
		
	}

	@Override
	public ServletConfig getServletConfig() 
	{
		return null;
	}

	@Override
	public String getServletInfo() 
	{
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("I have Created my Servlet");
		out.println("</body>");
		out.println("</html>");
	}

}
