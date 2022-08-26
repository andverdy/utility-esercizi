package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ClassiMain.Libro;
import Modelli.Album;

public class LambdaRaccoltaFunzionalita {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.setNome("PIPPO");
		libro1.setAutore("PINO");
		libro1.setTipoCopertina("TOSTA");
		Libro libro2 = new Libro();
		libro2.setNome("LILLO");
		libro2.setAutore("GINO");
		libro2.setTipoCopertina("MOLLA");
		
		String nomeLibro = "LILLO";
		String nomeAutore = "PINO";
		List<Libro> listLibri = Arrays.asList(libro1, libro2);
		Optional<Libro> libroEstratto = listLibri.stream().filter(i -> nomeLibro.equals(i.getNome()) && nomeAutore.equals("PINO")).findAny();
		
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		// scorri la lista e per ogni elem stampalo in lowerCase
		names.forEach(name -> System.out.println(name.toLowerCase()));

		// ------------------------------------------------------------------//
		// prendi tutti gli elem di albums, filtra per anno < 2000, se true aggiungi a song3 i title corrispondenti
		List<Album> albums = new ArrayList<>();
		List<String> songs = Arrays.asList("pippo", "pluto", "gerry", "callipo");
		List<String> songs3 = new ArrayList<>();
		albums.add(new Album("Pink Floyd", songs, 1994, "Picciolino"));
		albums.stream().filter(album -> album.getYear() < 2000).map(Album::getTitle).forEach(songs3::add);

		// ------------------------------------------------------------------//
		// scorri la lista ed esegui il metodo predo come parametro
		List<Integer> numbers = Arrays.asList(5, 6, 8, 9);
		numbers.forEach(System.out::println);

		// ------------------------------------------------------------------//
		// prendi tutti gli elemetni, chiamare createStep passando il name e resituisci la lista con i name concat
		List<String> stepsNames = Arrays.asList("MyStepA", "MyStepB", "MyStepC", "MyStepD");
		@SuppressWarnings("unused")
		List<String> steps = stepsNames.stream().map(stepName -> createStep(stepName)).collect(Collectors.toList());
		// ------------------------------------------------------------------//
		String denomination = "";
		String pioppone2 = null;
		// se pioppone2 � null resituisci un optional con default " "
		denomination = Optional.ofNullable(pioppone2).orElse(" ");

		// ------------------------------------------------------------------//
		// aggiung ad array2 gli elementi di array
		List<String> array = Arrays.asList("ntoniu", "pliniu", "pafinziu");
		List<String> array2 = new ArrayList<>();
		array.forEach(array2::add);

		// ------------------------------------------------------------------//
		//controlla se la lista � vuota, se � piu lunga di 3 e se la stringa in posizione 3 � uguale a true o false
		String[] array3 = new String[] { "true", "true", "false", "true", "true" };
		Boolean enableEgon = Boolean.parseBoolean(Optional.ofNullable(array3).filter(x -> x.length > 3).map(x -> x[3]).orElse(Boolean.TRUE.toString()));
		System.out.println(enableEgon);

	}

	public static String createStep(String stepName) {
		return stepName + "-NewStep";
	}

}
