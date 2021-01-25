package it.pinfo.magazzino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variabili_db")
public class VariabiliDb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_variabile_db")
	private Integer idVariabileDb;

	@Column(name = "primo_processo_effettuato")
	private Boolean primoProcessoEffettuato;

	public Boolean getPrimoProcessoEffettuato() {
		return primoProcessoEffettuato;
	}

	public void setPrimoProcessoEffettuato(Boolean primoProcessoEffettuato) {
		this.primoProcessoEffettuato = primoProcessoEffettuato;
	}

	public Integer getIdVariabileDb() {
		return idVariabileDb;
	}

	public void setIdVariabileDb(Integer idVariabileDb) {
		this.idVariabileDb = idVariabileDb;
	}

}
