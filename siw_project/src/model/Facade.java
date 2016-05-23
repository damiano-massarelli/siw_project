package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.GenericsDaoJPA;
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
	
	public Amministratore getAmministratore(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		
		GenericsDaoJPA<Amministratore> amministratoreDao = new GenericsDaoJPA<Amministratore>(em, Amministratore.class);
		Amministratore amministratore = amministratoreDao.findByPrimaryKey(id);
		em.close();
		emf.close();
		return amministratore;
	}
	
	public void aggiungiPaziente(String nome, String cognome, String email, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		GenericsDaoJPA<Paziente> pazienteDao = new GenericsDaoJPA<>(em, Paziente.class);
		Paziente paziente = new Paziente(nome, cognome, password, email);
		pazienteDao.save(paziente);
		
		em.close();
		emf.close();
	}

	public List<Medico> getAllMedici() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		GenericsDaoJPA<Medico> medicoDao = new GenericsDaoJPA<>(em, Medico.class);
		List<Medico> medici = medicoDao.findAll();
		
		em.close();
		emf.close();
		
		return medici;
		
	}
}

