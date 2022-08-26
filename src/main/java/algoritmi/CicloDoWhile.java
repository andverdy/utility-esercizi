package algoritmi;

import java.util.Arrays;
import java.util.List;

public class CicloDoWhile {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(23, 34, 11, 21, 1, 55);

		int index = 0;

		do {
			System.out.println("sono nel do while");
			index++;
		} while(index < lista.size());
	}
}
