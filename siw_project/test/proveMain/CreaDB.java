package proveMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreaDB {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();

	}

}
