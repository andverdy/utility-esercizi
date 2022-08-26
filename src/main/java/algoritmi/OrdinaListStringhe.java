package algoritmi;

import java.util.Arrays;
import java.util.List;

public class OrdinaListStringhe {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Pippo", "Ciccione", "Alfonso", "Pericle", "Gino", "Mia");
		boolean scambio = true;

		do {
			scambio = false;
			for(int j = 0; j < lista.size() - 1; j++) {
				if(lista.get(j + 1).length() < lista.get(j).length()) {
					String temp = lista.get(j + 1);
					lista.set(j + 1, lista.get(j));
					lista.set(j, temp);
					scambio = true;
				}
			}
			if(!scambio) {
				break;
			}
		} while(scambio);

		System.out.println(lista.toString());
	}
}
