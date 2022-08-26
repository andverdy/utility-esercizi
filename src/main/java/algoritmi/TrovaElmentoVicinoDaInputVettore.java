package algoritmi;

import java.util.Scanner;

public class TrovaElmentoVicinoDaInputVettore {

	/*
	 * TRACCIA ESERCIZIO Dato un vettore di 10 interi, tutti diversi fra loro, e un numero intero inserito da tastiera; scrivi un metodo statico che restituisca al programma principale,'elemento del vettore più vicino al numero inserito , la sua posizione nel vettore e la sua distanza dal numero inserito.(sugg. usare un vettore di 3 elementi) .
	 */

	// public static void main(String[] args) {
	// Integer input = 7;
	// int[] vettore = new int[10];
	// vettore[0] = 2;
	// vettore[1] = 21;
	// vettore[2] = 22;
	// vettore[3] = 4;
	// vettore[4] = 8;
	// vettore[5] = 9;
	// vettore[6] = 1;
	// vettore[7] = 13;
	// vettore[8] = 15;
	// vettore[9] = 27;
	//
	// System.out.println("Numero piu vicino: " + esercizio3(input, vettore)[0]);
	// System.out.println("Distanza Da Numero Inserito: " + esercizio3(input, vettore)[1]);
	// System.out.println("Posizone nel vettore: " + esercizio3(input, vettore)[2]);
	// }

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num;
		int V[] = { 12, 29, 44, 16, 1, 20, -5, 90, -20, 62 };
		int X[] = { 0, 0, 0 };
		System.out.print("ins.num.intero:");
		num = in.nextInt();
		in.close();
		fun(V, X, num);
		System.out.println("elemento:" + X[0]);
		System.out.println("indice:" + X[1]);
		System.out.println("distanza:" + X[2]);
	}// fine main

	static void fun(int T[], int Y[], int n) {
		// inizializzo X basandomi sui valori del 1°elemento di T
		Y[0] = T[0];
		Y[1] = 0;
		Y[2] = Math.abs(T[0] - n);
		for(int i = 1; i < T.length; i++)
			if(Math.abs(T[i] - n) < Y[2]) {
				Y[0] = T[i];
				Y[1] = i;
				Y[2] = Math.abs(T[i] - n);
			} // fine if
	}// fine fun

	public static int[] esercizio3(Integer input, int[] vettore) {
		Integer numPiuVicino = 0;
		Integer distanzaDaNumInput = 100;
		Integer posizione = 0;

		for(int i = 0; i < vettore.length - 1; i++) {
			if(vettore[i] < input) {
				if(input - vettore[i] < distanzaDaNumInput) {
					distanzaDaNumInput = input - vettore[i];
					numPiuVicino = vettore[i];
					posizione = i;
				}
			} else {
				if(vettore[i] - input < distanzaDaNumInput) {
					distanzaDaNumInput = vettore[i] - input;
					numPiuVicino = vettore[i];
					posizione = i;
				}
			}
		}

		int[] result = new int[3];
		result[0] = numPiuVicino;
		result[1] = distanzaDaNumInput;
		result[2] = posizione;
		return result;
	}
}
