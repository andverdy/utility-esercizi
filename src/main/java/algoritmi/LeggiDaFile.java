package algoritmi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiDaFile {

	public static BufferedReader br;

	public static void main(String[] args) {
		File file = new File("C:\\Users\\andrea.verdiglione\\Documents\\prova.txt");
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String st;
		try {
			while((st = br.readLine()) != null)
				System.out.println(st);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
