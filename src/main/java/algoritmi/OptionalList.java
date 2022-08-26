package algoritmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalList {

	public static void main(String[] args) {

		System.out.println("Example 1 : ------ Optional string ------ ");
		// Creating optional
		Optional<String> optional = Optional.ofNullable(null);

		// ifpresent syntax
		optional.ifPresent(value -> System.out.println(value));

		System.out.println("Example 2 : ------  Optional List of integers ------ ");

		// Creating list of numbers
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// Passing lsit to optional
		Optional<List<Integer>> numbersOfListOptional = Optional.ofNullable(list);

		// cheeking with ifpresent
		numbersOfListOptional.ifPresent(optionalList -> optionalList.forEach(v -> System.out.println(v)));

		//Optional empty = Optional.empty();
		//empty.ifPresent(valeu -> System.out.println("no value"));

		Optional<List<String>> postalAddressEntities = Optional.ofNullable(new ArrayList<String>());
//		postalAddressEntities.get().add("pinco");
//		postalAddressEntities.get().add("pincino");
//		postalAddressEntities.get().add("gigio");
//		// return Optional.ofNullable(postalAddressEntities).map(List::stream).orElse(Stream.empty()).map(entity -> modelMapper.map(entity, PostalAddress.class)).collect(Collectors.toList());

		System.out.println((postalAddressEntities).map(List::stream).orElse(Stream.empty()).collect(Collectors.toList()));

	}

}
