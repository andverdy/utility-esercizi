package Modelli;

public class Domini {

	public static void main(String[] args) {
		// parametro da input
		int param = 30;

		// mi prendo il nome filtrando con il parametro
		String nome = Occurrences.getByCode(param).getNome();

		// stampo risultato
		System.out.println(nome);
		
		// ecco come iterare l'enum
		for (Occurrences occ : Occurrences.values()) {
			System.out.println(occ.getNome());
		}

	}

}
