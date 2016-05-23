package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nuovoPaziente")
public class NuovoPazienteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// CONTROLLO COOKIE
		String nextPage = "/nuovoPaziente.jsp";
		HelperNewPatient helper = new HelperNewPatient();
		ActionNewPatient action = new ActionNewPatient();
		
		
		if(helper.validate(req, resp)) {
			nextPage = action.execute(req); // in realta' la pagina e' sempre la stessa, non serve assegnarla
		}
		
		ServletContext context = this.getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher(resp.encodeURL(nextPage));
		rd.forward(req, resp);
		
	}
	
	
}
