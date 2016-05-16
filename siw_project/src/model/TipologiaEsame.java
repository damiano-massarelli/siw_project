package model;

import java.util.HashMap;
import java.util.LinkedList;
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

	public TipologiaEsame(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Map<String, IndicatoreRisultato> getIndicatoriRisultato() {
		return indicatoriRisultato;
	}
	public void setIndicatoriRisultato(Map<String, IndicatoreRisultato> indicatoriRisultato) {
		this.indicatoriRisultato = indicatoriRisultato;
	}
	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}
	public void setPrerequisiti(List<Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	public List<Esame> getEsami() {
		return esami;
	}
	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}
	public TipologiaEsame(String codice, String nome, String descrizione, double costo) {
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.indicatoriRisultato = new HashMap<>();
		this.prerequisiti = new LinkedList<>();
		this.esami = new LinkedList<>();
	}
}
