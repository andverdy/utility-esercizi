package algoritmi;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(4);
		lista.add(1);
		lista.add(6);
		lista.add(5);
		lista.add(9);
		lista.add(9);

		for(Integer integer : lista) {
			System.out.println(integer);
		}
	}
}
