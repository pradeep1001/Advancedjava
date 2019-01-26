 // servlet code 

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("passwd");
		
		LoginCredential credential=new LoginCredential();
		
		credential.setUsername(username);
		credential.setPassword(password);
		
		if(credential.loginCheck())
		{
			request.setAttribute("username", username);
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("Failure.jsp");
			dispatcher.forward(request, response);
		}
	}

}
