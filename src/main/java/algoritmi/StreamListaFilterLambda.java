package algoritmi;

import java.util.Arrays;
import java.util.List;

public class StreamListaFilterLambda {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13, 14, 2, 66, 576, 98, 5);

		// variante 1
		list.stream().filter(i -> i > 345).forEach(i -> {
			System.out.println("stampa i pipi fritti: " + i);
		});

		// variante 2
		for(Integer integer : list) {
			if(integer > 345) {
				System.out.println("stampa i pipi fritti: " + integer);
			}
		}

	}
}
