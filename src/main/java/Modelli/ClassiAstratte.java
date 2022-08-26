package Modelli;

public class ClassiAstratte extends ClasseAstratta {

	private String nome;
	private String cognome;

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
	
	

	public static void main(String[] args) {
		
		ClassiAstratte classeEmail = new ClassiAstratte();
		classeEmail.cognome = "cionoa";
		classeEmail.setCognome("Plinio");
		String cogn = classeEmail.getCognome();
		classeEmail.setNome("Ermanno");
		String nome = classeEmail.getNome();
		String email = classeEmail.creaEmail(nome,cogn);
		System.out.println(email);
		
	}

	@Override
	public String creaDocumento(String nome, String cognome, String indirizzo, String telefono) {
		// TODO Auto-generated method stub
		return null;
	}

}

abstract class ClasseAstratta {

	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;
	final String ottopolo = "ciccino";
	public ClasseAstratta() {

	}


	public ClasseAstratta(String nome, String cognome, String indirizzo, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String creaEmail(String nome, String cognome) {
		String baseEmail = "@gmail.com";
		return nome+cognome+baseEmail;
	}
	
	public abstract String creaDocumento(String nome, String cognome, String indirizzo, String telefono);
}



abstract class ClasseAstratta2 {

	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;

	public ClasseAstratta2() {

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String creaEmail(String nome, String cognome) {
		String baseEmail = "@gmail.com";
		return nome+cognome+baseEmail;
	}
	
	public abstract String creaDocumento(String nome, String cognome, String indirizzo, String telefono);
}






