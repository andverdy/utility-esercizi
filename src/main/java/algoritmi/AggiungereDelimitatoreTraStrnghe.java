package algoritmi;

import java.util.StringJoiner;

public class AggiungereDelimitatoreTraStrnghe {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner("-");
		joiner.add("Piero").add("Pino").add("Alberto").add("Mickey").add("Ennio").add("Siria").add("Dario").add("Anna");

		String ciao = joiner.toString();
		System.out.println(ciao);
		System.out.println("pino");
	}
}
