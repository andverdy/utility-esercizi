package algoritmi;

import java.util.ArrayList;
import java.util.List;

public class SwithCase {

	static boolean listEmpty = true;
	static int maxCoholders = 4;

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		int index = 0;

		// List<String> list = Arrays.asList("ciao", "miao");
		List<String> list2 = new ArrayList<>();

		if(!list2.isEmpty()) {
			listEmpty = false;
			for(String string : list2) {
				result.append(string);
				index++;
				if(index == maxCoholders) {
					break;
				}
			}
		}

		switch (index) {
		case 1:
			result.append("432");
			break;
		case 2:
			result.append("288");
			break;
		case 3:
			result.append("144");
			break;
		default:
			result.append("576");
			break;
		}
	}
}
