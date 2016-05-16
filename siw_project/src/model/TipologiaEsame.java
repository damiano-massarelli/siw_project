package model;

import java.util.List;
import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class TipologiaEsame {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String codice;
	private String nome;
	private String descrizione;
	private double costo;
	
	@OneToMany
	@JoinColumn(name = "tipologia_id")
	private Map<String, IndicatoreRisultato> indicatoriRisultato;

	@OneToMany
	@JoinColumn(name = "tipologia_id")
	private List<Prerequisito> prerequisiti;
	
	@OneToMany(mappedBy = "tipologiaEsame")
	private List<Esame> esami;
}
