package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Modelli.Customer;

public class LambdaEOptonalTutorial {

	public static void main(String[] args) {

		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);

		// inserisci gli oggetti elencati nella lista
		List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

		// inserisci nella lista c1 solo gli oggetti della lista customers con points >
		// di 100
		@SuppressWarnings("unused")
		List<Customer> c1 = customers.stream().filter(c -> c.getPoints() > 100).collect(Collectors.toList());

		// inserisci nella lista c2 tutti gli oggetti della lista customers senza
		// filtrare
		@SuppressWarnings("unused")
		List<Customer> c2 = customers.stream().collect(Collectors.toList());

		//String pioppone = null;
		//String pioppone2 = "LUCIANO GABIBBO";
		String pioppone2 = "";
		String denomination = "LUCIANO GABIBBO";
		
		//pioppone = Optional.ofNullable(pioppone2).orElse(" ");
		
		
		
		if (pioppone2 == null || pioppone2.isEmpty()) {
			denomination = " ";
		}
		System.out.println(denomination);
		
		// se pioppone2 è null resituisci un optional con default " "
		denomination = Optional.ofNullable(pioppone2).orElse(" ");
		
		System.out.println(denomination);
		
		
//		List<String> lista = new ArrayList<String>();
//		List<String> nuovalista = new ArrayList<String>();
//		
//		CREA N COPIE DELLA LISTA SETTANDO LA LUNGHEZZA A 10
//		nuovalista.addAll(Collections.nCopies(10, null));
		

	}

}
