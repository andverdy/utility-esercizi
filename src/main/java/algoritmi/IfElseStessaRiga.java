package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IfElseStessaRiga {

	public static void main(String[] args) {

		String string = null;
		var string2 = "halleluja";
		var string3 = "halleluja";
		var empty = " ";
		var empty2 = "piccolo";
		var empty3 = "asino";

		boolean pippone = Objects.nonNull(string2) && string2.equals(string3) ? Boolean.TRUE : Boolean.FALSE;
		System.out.println(pippone);
		String pippone2 = Objects.nonNull(string2) && string2.equals(string3) ? " " : "-";
		System.out.println(pippone2);
		List<String> lists = Arrays.asList(string2, empty2, empty3);

		String result = !lists.isEmpty() && Objects.nonNull(lists.get(0)) ? "allocco" : "pesce gatto";
		System.out.println(result);
		// String newString = Objects.isNull(string) ? empty : string;
		var newString2 = empty.isBlank() ? string2 : string;
		System.out.println(newString2);
		var ciao = empty2.strip();
		System.out.println(ciao);
		lists.forEach(list -> ciao(list));

		switch (empty) {
		case "": {
			System.out.println("ok");
			break;
		}
		case " ": {
			System.out.println("ko");
			break;
		}
		default:
			System.out.println("DEFAULT");
		}

	}

	private static String ciao(String input) {
		return input;
	}

}
