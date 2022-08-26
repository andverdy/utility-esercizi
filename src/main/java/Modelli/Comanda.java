package Modelli;

import java.util.List;

public class Comanda {

	private Menu menu;
	private List<String> pastiAggiuntivi;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<String> getPastiAggiuntivi() {
		return pastiAggiuntivi;
	}

	public void setPastiAggiuntivi(List<String> pastiAggiuntivi) {
		this.pastiAggiuntivi = pastiAggiuntivi;
	}

}
