package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nuovoPaziente")
public class nuovoPazienteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// CONTROLLO COOKIE
		
		String nextPage = new ActionNewPatient().execute(req);
		
		getServletContext().getRequestDispatcher(resp.encodeURL(nextPage)).forward(req, resp);
		
	}
	
	
}
