package algoritmi;

import java.util.Arrays;
import java.util.List;

public class OrdinaConDoWhile {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(13, 14, 2, 66, 576, 98, 5);
		boolean scambio;

		do {
			scambio = false;
			for(int i = 0; i < lista.size() - 1; i++) {
				if(lista.get(i + 1) < lista.get(i)) {
					int temp = lista.get(i + 1);
					lista.set(i + 1, lista.get(i));
					lista.set(i, temp);
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
