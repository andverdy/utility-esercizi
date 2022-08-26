package algoritmi;

public class AlgoritmoVettoreValoriCrescenti {
	/*
	 * scrivi un metodo che ritorna true se un vettore contiene numeri crescenti, false altrienti
	 */

	public static void main(String[] args) {

		int[] vettore = new int[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };
		Boolean vettoreCrescente = false;

		for(int i = 0; i < vettore.length - 1; i++) {
			if(vettore[i + 1] > vettore[i]) {
				vettoreCrescente = true;
			} else {
				vettoreCrescente = false;
				break;
			}
		}
		System.out.println("il vettore è cresente? " + vettoreCrescente);
	}
}
