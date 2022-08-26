package algoritmi;

public class AlgoritmoSommaMetaVettore {

	public static void main(String[] args) {

		/*
		 * scrivere un metodo che verifica se in un vettore, il cui numero di elementi sia pari, la somma della prima met� degli elementi � uguale alla somma della seconda met� il metodo ritorna false se il vettore non � composto da un numero di elementi pari mentre se il vettore � composto da un numero di elementi pari , il metodo ritorna true se la condizione � verificata, altirmenti ritorna false
		 */

		int[] vettore = new int[] { 21, 12, 22, 34, 21, 12, 22, 34 };

		int metaVettore = vettore.length / 2;
		int sommaPrimaMeta = 0;
		int sommaSecondaMeta = 0;
		System.out.println("dammi la met� del vettore " + metaVettore);
		System.out.println("la size del vettore � pari? " + ePari(vettore.length));
		boolean laSommaDelleDueMetaEUguale = false;

		if(ePari(vettore.length)) {
			for(int i = 0; i < metaVettore; i++) {
				sommaPrimaMeta += vettore[i];
			}
			for(int i = metaVettore; i < vettore.length; i++) {
				sommaSecondaMeta += vettore[i];
			}
			System.out.println(sommaPrimaMeta);
			System.out.println(sommaSecondaMeta);

			if(sommaPrimaMeta == sommaSecondaMeta) {
				laSommaDelleDueMetaEUguale = true;
			}
			System.out.println("return " + laSommaDelleDueMetaEUguale);
		}
	}

	public static boolean ePari(int size) {
		boolean result = false;
		if((size % 2) == 0) {
			return result;
		}
		return result;
	}
}
