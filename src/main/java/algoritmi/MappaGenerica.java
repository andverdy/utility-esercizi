package algoritmi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappaGenerica {

	public static void main(String[] args) {

		Map<String, Object> mappaGenerica = new HashMap<>();

		mappaGenerica.put("1", "Pippo");
		mappaGenerica.put("2", 25);

		List<String> lista = Arrays.asList("3398474687", "83354738888", "334784893239");
		mappaGenerica.put("3", lista);

		mappaGenerica.put("4", "28/09/1986");
	}
}
