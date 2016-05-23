package controller;

import javax.servlet.http.HttpServletRequest;

import java.util.List;
import model.Facade;
import model.Medico;
import persistence.GenericsDaoJPA;

public class GetAllMediciAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		Facade facade = new Facade();
		List<Medico> medici = facade.getAllMedici();
		
		request.setAttribute("medici", medici);
		
		return "/medici.jsp";
	}

}
