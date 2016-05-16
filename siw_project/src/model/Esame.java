package model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Esame {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPrenotazione;
	
	@Temporal(TemporalType.DATE)
	private Date dataEsame;
	
	@ManyToOne
	@JoinColumn(name = "paziente_id")
	private Paziente paziente;
	
	@ManyToOne
	@JoinColumn(name = "tipologia_id")
	private TipologiaEsame tipologiaEsame;
	
	@ManyToOne
	@JoinColumn(name = "medico_id")
	private Medico medico;
	
	@OneToMany
	@JoinColumn(name = "esame_id")
	private List<Risultato> risultati;
}