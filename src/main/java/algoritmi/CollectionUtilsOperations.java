package algoritmi;

import java.util.Arrays;
import java.util.List;

import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class CollectionUtilsOperations {

	public static void main(String[] args) {
		MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		List<String> list = Arrays.asList("pippo", "ciccio");
		System.out.println(CollectionUtils.isEmpty(list));
		String cicic = CollectionUtils.firstElement(list);
		CollectionUtils.lastElement(list);
		System.out.println(CollectionUtils.hasUniqueObject(list));

		// if (!list.isEmpty()) {
		// list.stream().forEach(i -> queryParams.add("NOME", i));
		// }

	}
}
