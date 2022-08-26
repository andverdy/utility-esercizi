package algoritmi;

import java.util.Arrays;
import java.util.List;

public class Max {

	private static int maxVariante = 0;

	public static void main(String[] args) {

		// variante 1
		int[] array = { 3, 13, 5, 8, 1 };
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);

		// variante 2
		List<Integer> list = Arrays.asList(13, 14, 2, 66, 576, 98, 5);
		list.stream().filter(i -> i > maxVariante).forEach(i -> {
			maxVariante = i;
		});

		System.out.println("stampa max variante: " + maxVariante);
	}
}
