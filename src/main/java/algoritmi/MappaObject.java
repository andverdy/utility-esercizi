package algoritmi;

import java.util.HashMap;
import java.util.Map;

public class MappaObject {
	
	public static void main(String[] args) {
		
		Map<String, Object> mappa = new HashMap<>();
		mappa.put("Eta", 35);
		mappa.put("Nome", "Andrea");
		mappa.put("CF", "VRDNDR86P28D976K");
		mappa.put("PIVA", 25478541247L);
		
		System.out.println(mappa.get("Eta"));
		
	}

}
