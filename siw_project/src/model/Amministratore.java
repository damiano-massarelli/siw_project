package model;

import javax.persistence.*;

@Entity
public class Amministratore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String password;
	
	
}
