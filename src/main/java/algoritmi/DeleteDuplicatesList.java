package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicatesList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "A", "B");

		List<String[]> distinct = list.stream().map(Arrays::asList).distinct().map((e) -> e.toArray(new String[0])).collect(Collectors.toList());

		for(String[] array : distinct) {
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
}
