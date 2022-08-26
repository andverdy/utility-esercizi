package algoritmi;

import java.util.Scanner;

public class ScannerInputDaConsole {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci di seguito un valore che vuoi visualizzare ->");
		String ciao = scanner.nextLine();
		System.out.println("stampa ciò che hai scritto in input: " + ciao);
		scanner.close();
	}

}
