package controller;

import javax.servlet.http.HttpServletRequest;

import model.Facade;
import model.Paziente;

public class Action {
		public String execute(HttpServletRequest request){
			//interagisce con la facade
			Facade facade = new Facade();
			Paziente paziente = new Paziente();
			paziente=facade.prendiPaziente(request);
			String password=paziente.getPassword();
			if(paziente.getId().equals("") && !paziente.checkPassword(password)){
				request.setAttribute("logError", "id e/o password errati");
				return "/autenticaPaziente.jsp";
			}
			request.setAttribute("paziente", paziente);
			
			return "/benvenuto.jsp";
		}

}
