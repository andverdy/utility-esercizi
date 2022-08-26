package algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Modelli.Cane;

public class EstraiIlCampoCognomeDaOgniOggPresenteNellaLista {

	public static void main(String[] args) {
		Cane canino = new Cane();
		canino.setCognome("pillo");
		canino.setNome("Rilocco");
		canino.setIndirizzo("via randagi");
		List<Cane> lista = new ArrayList<>();
		lista.add(canino);
		canino.setList(lista);

		List<Cane> cani = getCaneLista(canino);
		System.out.println("ciao");

		List<String> cognomeCane = cani.stream().map(Cane::getCognome).collect(Collectors.toList());
		System.out.println(cognomeCane);
	}

	// aggiunge l'oggetto input alla lista da restituire se getList non è null altrim return null
	private static List<Cane> getCaneLista(Cane cane) {
		return Optional.ofNullable(cane).map(Cane::getList).orElse(null);

	}

}
