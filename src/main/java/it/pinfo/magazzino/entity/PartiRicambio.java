package it.pinfo.magazzino.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "parti_ricambio")
public class PartiRicambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_parte")
	private Long idParte;

	@Column(name = "matricola")
	private String matricola;

	@Column(name = "desc_parte")
	private String descParte;

	@Column(name = "stato")
	private String stato;

	@Column(name = "aggiornato")
	private Boolean aggiornato;

	@Column(name = "condizioni_parte")
	private String condizioniParte;

	@Column(name = "id_cliente")
	private Integer cliente;

	public Long getIdParte() {
		return idParte;
	}

	public void setIdParte(Long idParte) {
		this.idParte = idParte;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getDescParte() {
		return descParte;
	}

	public void setDescParte(String descParte) {
		this.descParte = descParte;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCondizioniParte() {
		return condizioniParte;
	}

	public void setCondizioniParte(String condizioniParte) {
		this.condizioniParte = condizioniParte;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public Boolean getAggiornato() {
		return aggiornato;
	}

	public void setAggiornato(Boolean aggiornato) {
		this.aggiornato = aggiornato;
	}

}
