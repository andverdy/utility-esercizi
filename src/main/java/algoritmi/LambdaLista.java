package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaLista {

	public static void main(String[] args) {
		List<String> array = Arrays.asList("ntoniu", "pliniu", "pafinziu");
		List<String> array2 = new ArrayList<>(array);
		array.forEach(array2 :: add);
		
	}
}
