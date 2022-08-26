package algoritmi;

import java.util.HashMap;
import java.util.Map;

public class Mappe {

	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		map.put("Sportello num. 1", 88L);
		map.put("Sportello num. 2", 0L);
		map.put("Sportello num. 3", 15L);
		map.put("Sportello num. 4", 0L);
		map.put("Sportello num. 5", 0L);

		for(Map.Entry<String, Long> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println(map);
		
		
		
	}
}
