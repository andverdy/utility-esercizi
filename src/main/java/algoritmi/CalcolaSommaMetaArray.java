package algoritmi;

public class CalcolaSommaMetaArray {

	public static void main(String[] args) {

		int[] array = new int[] { 3, 5, 12, 2, 14, 6, 7, 12, 13, 32 };

		int metaArray = 0, sommaPrimaMetaArray = 0, sommaSecondaMetaArray = 0;
		metaArray = array.length / 2;
		// System.out.println("stampa la metà della lunghezza dell'array: " + metaArray);
		for(int i = 0; i < array.length; i++) {
			if(i < metaArray) {
				sommaPrimaMetaArray += array[i];
			} else {
				sommaSecondaMetaArray += array[i];
			}
		}

		System.out.println("Stampa la somma della prima metà: " + sommaPrimaMetaArray);
		System.out.println("Stampa la somma della prima metà: " + sommaSecondaMetaArray);
	}
}
