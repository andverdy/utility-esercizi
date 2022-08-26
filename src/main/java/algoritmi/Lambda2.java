package algoritmi;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda2 {

	// public static void main(String[] args) {
	// ArrayList<Integer> numbers = new ArrayList<Integer>();
	// numbers.add(5);
	// numbers.add(9);
	// numbers.add(8);
	// numbers.add(1);
	// //passa tutti i parametri della lista con "n" alla syso
	// numbers.forEach((n) -> {
	// System.out.println(n);
	// });
	// }

	// Utilizzare l'interfaccia java per memorizzare un'espressione lambda in una variabile:Consumer
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);
	}

}
