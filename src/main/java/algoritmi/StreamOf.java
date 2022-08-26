package algoritmi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOf {
	
	public static void main(String[] args) {
		// inserisci nella lista gli elementi passati nel metodo of()
		List<String> list = Stream.of("ciccio", "gaetano").collect(Collectors.toList());
		System.out.println(list);
	}

}
