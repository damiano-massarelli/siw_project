package model;

import java.util.List;
import java.util.Map;

public class TipologiaEsame {
	private String codice;
	private String nome;
	private String descrizione;
	private double costo;
	
	private Map<String, IndicatoreRisultato> indicatoriRisultato;

	private List<Prerequisito> prerequisiti;
	
	private List<Esame> esami;
}
