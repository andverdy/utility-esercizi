package Modelli;

import java.util.Arrays;

public enum Occurrences {

	UNO(10, "pippo"), DUE(30, "lippo"), TRE(5, "ciuccio");

	private final int code;
	private final String nome;

	public static Occurrences getByCode(int codeInput) {
		return Arrays.stream(Occurrences.values()).filter(x -> x.getCode() == (codeInput)).findFirst().orElse(null);
	}

	Occurrences(int code, String nome) {
		this.code = code;
		this.nome = nome;
	}

	public int getCode() {
		return code;
	}

	public String getNome() {
		return nome;
	}

}
