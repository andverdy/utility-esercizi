package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Modelli.Libro;

public class OperazioniSuLista {

	public static void main(String[] args) {

		Libro libro = new Libro();
		Libro libro2 = new Libro();
		libro2.setNome("ernesto");

		Libro libro3 = new Libro();
		libro3.setNome("Puffetta");

		List<Libro> listLibro = Arrays.asList(libro, libro2, libro3);
		Set<Libro> set = new HashSet<>();
		set.add(libro3);
		set.add(libro);
		set.add(libro2);
		listLibro.forEach(System.out::println);

		List<String> lists = Arrays.asList("ucciolo", "fremulo", "trimulo", "scippolo");
		List<String> newList = new ArrayList<>();

		// copia gli elementi di lists dentro newList
		lists.forEach(list -> newList.add(list));

		for(String string : newList) {
			System.out.println("stampa l'iesima stringa: " + string);
		}

		List<Object> listObject = new ArrayList<>();
		listObject.add("ciao");
		listObject.add(123L);
		listObject.add('e');
		listObject.add(new ArrayList<String>());
		listObject.add(2009);

	}

}
