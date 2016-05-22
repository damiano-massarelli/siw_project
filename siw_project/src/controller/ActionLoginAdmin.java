package controller;

import javax.servlet.http.HttpServletRequest;

import model.Facade;
import model.Amministratore;

public class ActionLoginAdmin implements Action {
	@Override
	public String execute(HttpServletRequest request){
		//interagisce con la facade
		String nextPage = "/adminPanel.jsp";
		Facade facade = new Facade();
		Long id = Long.parseLong(request.getParameter("id"));
		Amministratore amministratore = facade.getAmministratore(id); // non mi sembra reale che l'id sia preso dal login
		if(amministratore == null || !amministratore.checkPassword(request.getParameter("password"))) {
			request.setAttribute("logError", "id e/o password errati");
			nextPage = "/admin.jsp";
		}
		request.setAttribute("amministratore", amministratore);
		
		return nextPage;
	}
}
