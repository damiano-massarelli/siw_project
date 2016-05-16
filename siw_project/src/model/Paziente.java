package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Paziente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private String password;
	
	private String email;
	
	@OneToMany(mappedBy = "paziente")
	private List<Esame> esami;
}
