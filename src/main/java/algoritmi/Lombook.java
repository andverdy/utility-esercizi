package algoritmi;

import java.util.Arrays;
import java.util.List;

import ClassiMain.Libro;

public class Lombook {

	
	public static void main(String[] args) {
		Libro libro = Libro.builder().nome("pippo").build();
		Libro libro2 = Libro.builder().nome("millo").build();
		
		List<Libro> libri = Arrays.asList(libro, libro2);
	}
}
