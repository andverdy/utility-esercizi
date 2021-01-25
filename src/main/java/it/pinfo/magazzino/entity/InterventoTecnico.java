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
@Table(name = "intervento_tecnico")
public class InterventoTecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_intervento_tecnico")
	private Integer idInterventoTecnico;

	@Column(name = "matricola_parte_new")
	private String matricolaParteNew;

	@Column(name = "matricola_parte_old")
	private String matricolaParteOld;

	@Column(name = "tipo_intervento")
	private String tipoIntervento;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "data_intervento")
	private Date dataIntervento;

	@Column(name = "esito")
	private String esito;

	@Column(name = "id_cliente")
	private Integer idCliente;

	public InterventoTecnico() {

	}

	public Integer getIdInterventoTecnico() {
		return idInterventoTecnico;
	}

	public void setIdInterventoTecnico(Integer idInterventoTecnico) {
		this.idInterventoTecnico = idInterventoTecnico;
	}

	public String getMatricolaParteNew() {
		return matricolaParteNew;
	}

	public void setMatricolaParteNew(String matricolaParteNew) {
		this.matricolaParteNew = matricolaParteNew;
	}

	public String getMatricolaParteOld() {
		return matricolaParteOld;
	}

	public void setMatricolaParteOld(String matricolaParteOld) {
		this.matricolaParteOld = matricolaParteOld;
	}

	public String getTipoIntervento() {
		return tipoIntervento;
	}

	public void setTipoIntervento(String tipoIntervento) {
		this.tipoIntervento = tipoIntervento;
	}

	public Date getDataIntervento() {
		return dataIntervento;
	}

	public void setDataIntervento(Date dataIntervento) {
		this.dataIntervento = dataIntervento;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "InterventoTecnico [idInterventoTecnico=" + idInterventoTecnico + ", matricolaParteNew="
				+ matricolaParteNew + ", matricolaParteOld=" + matricolaParteOld + ", tipoIntervento=" + tipoIntervento + ", dataIntervento=" + dataIntervento + ", esito=" + esito
				+ ", idCliente=" + idCliente + "]";
	}

}
