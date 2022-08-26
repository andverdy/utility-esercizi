package algoritmi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertiListaInSet {

	public static void main(String[] args) {

		String pippo = "pippo";
		String pippo2 = "pippo";
		String plutoo = "pluti";
		
		List<String> list = Arrays.asList(pippo, pippo2, plutoo);

		Set<String> myset = list.stream().collect(Collectors.toSet());

		// stampa con ciclo for
		for(String s : myset) {
			System.out.println(s);
		}

		// stampa con iteratore
		Iterator<String> itr = myset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
