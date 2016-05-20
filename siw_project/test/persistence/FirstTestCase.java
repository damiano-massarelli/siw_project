package persistence;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Paziente;

import org.junit.Test;

public class FirstTestCase {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit-test");
    private static EntityManager em = emf.createEntityManager();
	
	@Test
	public void test() {
		Paziente paziente1 = new Paziente("simone", "ceccarelli", "password1", "cecio.simone@lol.xd");
		Paziente paziente2 = new Paziente("damiano", "massarelli", "password2", "damiano.massarelli@gmail.com");
		Paziente paziente3 = new Paziente("marco", "zoveralli", "password3", "marco.zoveralli@gmail.com");
		GenericsDao<Paziente> pazienteDaoJPA = new GenericsDaoJPA<>(em, Paziente.class);
		pazienteDaoJPA.save(paziente1);
		pazienteDaoJPA.save(paziente2);
		pazienteDaoJPA.save(paziente3);
		
		assertNotNull(pazienteDaoJPA.findAll());
		assertEquals(3, pazienteDaoJPA.findAll().size());
	
		assertEquals("zoveralli", pazienteDaoJPA.findByPrimaryKey(new Long(3)).getCognome());
	
		paziente1.setEmail("ceccarellisimone1@gmail.com");
		pazienteDaoJPA.update(paziente1);
		assertEquals("ceccarellisimone1@gmail.com", pazienteDaoJPA.findByPrimaryKey(new Long(1)).getEmail());
	
		pazienteDaoJPA.delete(paziente3);
		assertEquals(2, pazienteDaoJPA.findAll().size());
		
		em.close();
		emf.close();
	}

}
