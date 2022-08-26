package algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcolatriceSemplice {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fai i tuoi calcoli!");
		String espressione = scanner.nextLine();
		System.out.println("Risultato: " + calcola(espressione));
	}

	public static float calcola(String espressione) {
		boolean operazioniTerminate = false;
		float risultato = 0;
		boolean operandoTrovato = false;
		boolean in = true;
		List<String> lista = new ArrayList<>();
		int index = 0;
		List<String> listaStr = new ArrayList<>();

		for(int i = 0; i < espressione.length(); i++) {
			if(espressione.charAt(i) == '*' || espressione.charAt(i) == '+' || espressione.charAt(i) == '-' || espressione.charAt(i) == '/') {
				lista.add(lista.size(), String.valueOf(espressione.charAt(i)));
				operandoTrovato = true;
				index = lista.size();
			} else {
				if(operandoTrovato) {
					lista.add(String.valueOf(espressione.charAt(i)));
					operandoTrovato = false;
				} else {
					if(lista.isEmpty()) {
						lista.add(i, String.valueOf(espressione.charAt(i)));
					} else {
						lista.set(index, lista.get(index) + String.valueOf(espressione.charAt(i)));
					}
				}
			}
		}

		for(String str : lista) {
			listaStr.add(str);
		}

		while(listaStr.size() > 3) {
			if(!operazioniTerminate) {
				while(in) {
					in = false;
					for(int i = 0; i < listaStr.size(); i++) {
						if(listaStr.size() == 3) {
							operazioniTerminate = true;
							break;
						}
						if(listaStr.get(i).equals("*")) {
							Float temp = Float.valueOf(listaStr.get(i - 1)) * Float.valueOf(listaStr.get(i + 1));
							listaStr.remove(i - 1);
							listaStr.remove(i - 1);
							listaStr.remove(i - 1);
							listaStr.add(i - 1, String.valueOf(temp));
							in = true;
							i = 0;
						} else if(listaStr.get(i).equals("/")) {
							Float temp = Float.valueOf(listaStr.get(i - 1)) / Float.valueOf(listaStr.get(i + 1));
							listaStr.remove(i - 1);
							listaStr.remove(i - 1);
							listaStr.remove(i - 1);
							listaStr.add(i - 1, String.valueOf(temp));
							in = true;
							i = 0;
						}
					}
					if(!in) {
						break;
					}
				}
			}

			if(!operazioniTerminate) {
				for(int i = 0; i < listaStr.size(); i++) {
					if(listaStr.size() == 3) {
						operazioniTerminate = true;
						break;
					}
					if(listaStr.get(i).equals("+")) {
						Float temp = Float.valueOf(listaStr.get(i - 1)) + Float.valueOf(listaStr.get(i + 1));
						listaStr.remove(i - 1);
						listaStr.remove(i - 1);
						listaStr.remove(i - 1);
						listaStr.add(i - 1, String.valueOf(temp));
					}
				}
			}

			if(!operazioniTerminate) {
				for(int i = 0; i < listaStr.size(); i++) {
					if(listaStr.size() == 3) {
						operazioniTerminate = true;
						break;
					}
					if(listaStr.get(i).equals("-")) {
						Float temp = Float.valueOf(listaStr.get(i - 1)) - Float.valueOf(listaStr.get(i + 1));
						listaStr.remove(i - 1);
						listaStr.remove(i - 1);
						listaStr.remove(i - 1);
						listaStr.add(i - 1, String.valueOf(temp));
					}
				}
			}
		}
		switch (listaStr.get(1)) {
		case "*": {
			risultato = Float.valueOf(listaStr.get(0)) * Float.valueOf(listaStr.get(2));
			break;
		}
		case "/": {
			risultato = Float.valueOf(listaStr.get(0)) / Float.valueOf(listaStr.get(2));
			break;
		}
		case "+": {
			risultato = Float.valueOf(listaStr.get(0)) + Float.valueOf(listaStr.get(2));
			break;
		}
		case "-": {
			risultato = Float.valueOf(listaStr.get(0)) - Float.valueOf(listaStr.get(2));
			break;
		}
		}
		return risultato;
	}
}
