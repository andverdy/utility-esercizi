package algoritmi;

import java.util.HashMap;
import java.util.Map;

public class MappaNoDuplicati {

	public static void main(String[] args) {

		Map<Integer, Integer> mappa = new HashMap<>();
		mappa.put(5, 7);
		mappa.put(4, 8);
		mappa.put(2, 3);
		mappa.put(2, 3);

		// System.out.println(mappa);
		// stampa chiave
		for (Integer keys : mappa.keySet()) {
			System.out.println(keys);
		}

		// stampa valore
		for (Integer value : mappa.values()) {
			System.out.println(value);
		}
		
		//stampa entrambi
		mappa.forEach((key, value) -> System.out.println(key + ":" + value));
		

	}
}
