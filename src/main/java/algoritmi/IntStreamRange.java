package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamRange {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13, 14, 2, 66, 576, 98, 5);

		// crea un indice sequenziale che va da 0 alla lunghezza della lista
		IntStream.range(0, list.size()).forEach(i -> {
			System.out.println(i);
		});
	}

}
