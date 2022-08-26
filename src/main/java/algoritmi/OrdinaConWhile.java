package algoritmi;

import java.util.Arrays;
import java.util.List;

public class OrdinaConWhile {

	public static void main(String[] args) {
		int temp = 0;
		boolean scambio;
		List<Integer> lista = Arrays.asList(13, 2, 55, 44, 1, 19);
		int index = 0;

		do {
			scambio = false;
			while(index < lista.size() - 1) {
				if(lista.get(index + 1) < lista.get(index)) {
					temp = lista.get(index + 1);
					lista.set(index + 1, lista.get(index));
					lista.set(index, temp);
					scambio = true;
				}
				index++;
			}
			index = 0;
			if(!scambio) {
				break;
			}
		} while(scambio);
		System.out.println(lista.toString());
	}

}
