package Modelli;

public enum ProvaEnum {
	H("Hydrogen"), HE("Helium"),
	// ...
	NE("Neon");

	public final String label;

	private ProvaEnum(String label) {
		this.label = label;
	}

}
