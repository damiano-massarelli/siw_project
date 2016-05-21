package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginAdmin")
public class LoginControllerAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ActionLoginAdmin action = new ActionLoginAdmin();
		String nextPage = action.execute(request);
		request.getServletContext().getRequestDispatcher(response.encodeURL(nextPage)).forward(request, response);
	}

}
