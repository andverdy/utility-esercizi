package it.pinfo.magazzino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_finale")
public class ClienteFinale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente_finale")
	private Long idClienteFinale;

	@Column(name = "insegna")
	private String insegna;

	@Column(name = "indirizzo")
	private String indirizzo;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	private String email;

	public Long getIdClienteFinale() {
		return idClienteFinale;
	}

	public void setIdClienteFinale(Long idClienteFinale) {
		this.idClienteFinale = idClienteFinale;
	}

	public String getInsegna() {
		return insegna;
	}

	public void setInsegna(String insegna) {
		this.insegna = insegna;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
