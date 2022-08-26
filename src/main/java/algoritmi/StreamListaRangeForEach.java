package algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamListaRangeForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		list.add("Ciccolo");
		list.add("Puzzolo");
		list.add("Frittolo");

		// range -> Restituisce un IntStream ordinato sequenzialmente da startInclusive(inclusive) a endExclusive (exclusive) con un passo incrementale di 1
		// foreach -> Esegue un'azione per ogni elemento di questo flusso. Questa è un'operazione terminale.
		// Per le pipeline di flussi paralleli, questa operazione non garantisce il rispetto dell'ordine di incontro del flusso,
		// in quanto ciò sacrificherebbe il vantaggio del parallelismo. Per ogni dato elemento, l'azione può essere eseguita in
		// qualsiasi momento e in qualsiasi thread la biblioteca scelga. Se l'azione accede allo stato condiviso,
		// è responsabile di fornire la sincronizzazione richiesta.

		IntStream.range(0, list.size()).forEach(index -> {
			System.out.println(list.get(index));
			list3.add(list.get(index));
		});
		System.out.println(list3);
	}
}
