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

	public Risultato(){}
	public Risultato(int valore, IndicatoreRisultato indicatoreRisultato) {
		this.valore = valore;
		this.indicatoreRisultato = indicatoreRisultato;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getValore() {
		return valore;
	}
	public void setValore(int valore) {
		this.valore = valore;
	}
	public IndicatoreRisultato getIndicatoreRisultato() {
		return indicatoreRisultato;
	}
	public void setIndicatoreRisultato(IndicatoreRisultato indicatoreRisultato) {
		this.indicatoreRisultato = indicatoreRisultato;
	}
	
}
