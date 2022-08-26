package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Modelli.Customer;

public class IfFilterSenzaCondizione {

	public static void main(String[] args) {
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);

		List<Customer> list1 = Arrays.asList(john, sarah, charles, mary);
		// filtra per ogni oggetto di list1, se contiene un campo con nome Sarah M.lo aggiungi alla list2
		List<Customer> list2 = list1.stream().filter(c -> c.getName().equals("Sarah M.")).collect(Collectors.toList());

		list1.forEach(n -> list2.add(n.getName().equals("John P.") ? new Customer("pippo", 1) : new Customer("ciuco", 2)));

		String ciccio = Optional.ofNullable(list2.get(0).getName()).filter(String::isEmpty).orElse(null);
		System.out.println(ciccio);
		
		//chiama direttamente il metodo add
		List<String> array = Arrays.asList("ntoniu", "pliniu", "pafinziu");
		List<String> array2 = new ArrayList<>();
		array.forEach(array2 :: add);
		
	}
}
