package Modelli;

import java.util.List;

public class Cane {

	private String nome;
	private String cognome;
	private String indirizzo;
	private List<Cane> list;

	public List<Cane> getList() {
		return list;
	}

	public void setList(List<Cane> list) {
		this.list = list;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

}
