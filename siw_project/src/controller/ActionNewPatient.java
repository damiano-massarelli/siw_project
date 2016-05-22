package controller;

import javax.servlet.http.HttpServletRequest;

import model.Facade;

public class ActionNewPatient implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "/nuovoPaziente.jsp";
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//CHECK (la mail non deve essere gia' stata usata)
		
		// Se tutto va bene...
		request.setAttribute("success", true);
		
		Facade facade = new Facade();
		facade.aggiungiPaziente(nome, cognome, email, password);
		
		//fine: se tutto va bene
		
		return nextPage;
	}

}
