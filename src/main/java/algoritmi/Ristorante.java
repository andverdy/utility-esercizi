package algoritmi;

import Modelli.Menu;

public class Ristorante {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.getAntipasti().add("Antipasto Di Mare");
		menu.getPrimi().add("Pasta e Sugo");
		menu.getSecondi().add("Bistecca");
		menu.getFrutta().add("Pizzitangolo");
	}
}
