package algoritmi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MappaOperazioniVarie {

	public static void main(String[] args) {

		Map<Integer, String> mappa = new HashMap<>();

		mappa.put(2, "Palla");
		mappa.put(22, "Pallina");

		// se contiene la chiave due return true
		System.out.println(mappa.containsKey(2));

		// se contiene il valore due return true
		System.out.println(mappa.containsValue("Palla"));

		// leggi il valore tramite la chiave
		System.out.println(mappa.get(2));
		
		
		Integer ciccio = mappa.keySet().iterator().next();

		// estrai un set di chiavi
		Set<Integer> set = mappa.keySet();
		for(Integer key : set) {
			System.out.println("stampa le chiavi: " + key);
		}

		// converti le chiavi sopra estratte in una lista
		List<Integer> listaFromKeys = new ArrayList<>(set);
		for(Integer integer : listaFromKeys) {
			System.out.println("stampa la lista di chiavi proveniente dal set: " + integer);
		}

		// estrai un set di valori
		Collection<String> values = mappa.values();
		for(String value : values) {
			System.out.println("stampa i valori: " + value);
		}

		// converti i valori sopra estratti in una lista
		List<String> listaFromValues = new ArrayList<>(values);
		for(String value : listaFromValues) {
			System.out.println("stampa la lista di valori proveniente dal set: " + value);
		}

		// estrai sia chiave che valore
		Set<Entry<Integer, String>> entrtSet = mappa.entrySet();
		Iterator<Entry<Integer, String>> i = entrtSet.iterator();

		while(i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println("stampa il set2 tramite l'Iterator: " + object);
		}
	}
}
