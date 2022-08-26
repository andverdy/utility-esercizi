package algoritmi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriviSuFileTxt {

	public static FileWriter writer;

	public static void main(String[] args) {

		try {
			writer = new FileWriter("C:\\Users\\andrea.verdiglione\\Documents\\prova.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter bufferWriter = new BufferedWriter(writer);

		try {
			// qualsiasi sia la stringa scrivi sempre i primi 5 caratteri
			//bufferWriter.write("Primolosso", 0, 5);
			bufferWriter.write("Primo");
			bufferWriter.write("\n" + "Secondo");
			bufferWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
