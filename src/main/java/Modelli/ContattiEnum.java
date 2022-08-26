package Modelli;

public enum ContattiEnum {

	NOME(1, "Nome"), ETA(2, "Eta"), CONTATTI(3, "Lista contatti"), DATA_DI_NASCITA(4, "Data di nascita");

	private final Integer internalCode;
	private final String values;

	public Integer getInternalCode() {
		return internalCode;

	}

	public String getValues() {
		return values;
	}

	private ContattiEnum(Integer internalCode, String values) {
		this.internalCode = internalCode;
		this.values = values;
	}

}
