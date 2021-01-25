package it.pinfo.magazzino.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "movimento")
public class Movimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movimento")
	private Integer idMovimento;

	@Column(name = "matricola_parte")
	private String matricolaParte;

	@Column(name = "descrizione_parte")
	private String descrizioneParte;

	@Column(name = "tipo_movimento")
	private String tipoMovimento;

	@Column(name = "condizioni_parte")
	private String condizioniParte;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "data_Movimento")
	private Date dataMovimento;

	@Column(name = "id_cliente")
	private Integer idCliente;

	public Integer getIdMovimento() {
		return idMovimento;
	}

	public void setIdMovimento(Integer idMovimento) {
		this.idMovimento = idMovimento;
	}

	public String getMatricolaParte() {
		return matricolaParte;
	}

	public void setMatricolaParte(String matricolaParte) {
		this.matricolaParte = matricolaParte;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public String getCondizioniParte() {
		return condizioniParte;
	}

	public void setCondizioniParte(String condizioniParte) {
		this.condizioniParte = condizioniParte;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getDescrizioneParte() {
		return descrizioneParte;
	}

	public void setDescrizioneParte(String descrizioneParte) {
		this.descrizioneParte = descrizioneParte;
	}

	@Override
	public String toString() {
		return "Movimento [idMovimento=" + idMovimento + ", matricolaParte=" + matricolaParte + ", descrizioneParte="
				+ descrizioneParte + ", tipoMovimento=" + tipoMovimento + ", condizioniParte=" + condizioniParte
				+ ", dataMovimento=" + dataMovimento + ", idCliente=" + idCliente + "]";
	}

}
