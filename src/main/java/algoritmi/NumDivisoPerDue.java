package algoritmi;

import java.util.Scanner;

public class NumDivisoPerDue {

	static int numMancante;

	public static void main(String[] args) {

		// calcolaa due numeri, dividendoli per due dovrai ottenere il risultto 4

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci dei numeri da calcolare");
		int[] num = new int[7];
		for(int i = 0; i < num.length - 1; i++) {
			num[i] = sc.nextInt();
		}

		boolean trovato = false;

		if(num.length > 0) {
			while(!trovato) {
				for(int i = 0; i < num.length - 1; i++) {

					if(num[i] / 2 == 4) {
						System.out.println("Il numero corretto è " + num[i]);
						trovato = true;
					}
				}
				if(!trovato) {
					System.out.println("Non è presente il numero corretto!");
					trovato = true;
				}
			}
		}
	}
}
