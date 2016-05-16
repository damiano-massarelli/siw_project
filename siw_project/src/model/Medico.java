package model;

import java.util.List;

import javax.persistence.OneToMany;

public class Medico {
	private String nome;
	private String cognome;
	private String specializzazione;
	
	@OneToMany(mappedBy = "medico")
	private List<Esame> esami;
}