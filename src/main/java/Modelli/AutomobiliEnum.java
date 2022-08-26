package Modelli;

public enum AutomobiliEnum {

	LANCIA_DELTA(1), FIAT_BRAVO(2), GOLF(3);

	private final int size;

	AutomobiliEnum(int i) {
		this.size = i;
	}

	public int getSize() {
		return size;
	}
	

}
