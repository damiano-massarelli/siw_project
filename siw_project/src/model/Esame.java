package model;

import java.util.Date;
import java.util.List;

public class Esame {
	private Date dataPrenotazione;
	private Date dataEsame;
	
	private Paziente paziente;
	
	private TipologiaEsame tipologiaEsame;
	
	private Medico medico;
	
	private List<Risultato> risultati;
}