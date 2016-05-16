package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Risultato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int valore;
	
	@ManyToOne
	@JoinColumn(name = "indicatore_id")
	private IndicatoreRisultato indicatoreRisultato;
}
