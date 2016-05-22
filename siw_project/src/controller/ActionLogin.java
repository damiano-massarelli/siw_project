package controller;

import javax.servlet.http.HttpServletRequest;

import model.Facade;
import model.Paziente;

public class ActionLogin implements Action {
	
	@Override
	public String execute(HttpServletRequest request){
			//interagisce con la facade
			Facade facade = new Facade();
			Paziente paziente = facade.getPaziente(request.getParameter("email"));
			if(paziente == null || !paziente.checkPassword(request.getParameter("password"))) 
				request.setAttribute("logError", "email e/o password errati");
			
			request.setAttribute("paziente", paziente);
			
			return "/index.jsp";
		}

}
