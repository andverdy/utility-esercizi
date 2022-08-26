package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import Modelli.Libro;

public class ConvertiListaInAltraLista {

	public static void main(String[] args) {
		// converti lista in altra lista
		List<Libro> libri = new ArrayList<>();

		libri.add(new Libro());

		List<Libro> ecids = libri.stream().distinct().collect(Collectors.toList());
		System.out.println(ecids);

		// togli gli elementi ripetuti con il distinct()
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
	}

}
