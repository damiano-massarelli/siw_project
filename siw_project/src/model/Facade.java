package model;
/*
 * 
 * 
 * MARCOLINO
 * 
 * 
 * 
 */
/* import it.uniroma3.persistence.StudenteDaoJDBC;*/

import javax.servlet.http.HttpServletRequest;

public class Facade {
	/**
	 * inserisce lo studente passato nel DB tramite un oggetto DAO
	 * @param studente
	 */

	public void inserisciPaziente(Paziente paziente){
		/*
		StudenteDaoJDBC studenteDao = new StudenteDaoJDBC();
		studenteDao.save(studente);	
		*/
	}
	public Paziente prendiPaziente(HttpServletRequest request){
		return new Paziente();
	}
}

