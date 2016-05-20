package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.PazienteDaoJPA;

public class Facade {

	public void inserisciPaziente(Paziente paziente){
		/*
		StudenteDaoJDBC studenteDao = new StudenteDaoJDBC();
		studenteDao.save(studente);	
		*/
	}
	
	public Paziente getPaziente(String email) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		PazienteDaoJPA pazienteDao = new PazienteDaoJPA(em);
		Paziente paziente = pazienteDao.findByEmail(email);
		em.close();
		emf.close();
		return paziente;
		
	}
}

