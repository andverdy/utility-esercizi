package algoritmi;

import java.util.Optional;

public class ConvetIntegerStringIfElseAbbreviati {

	public static void main(String[] args) {
		Integer pippo = 24;
		Long poppo = 23L;

		System.out.println(toStringFromCobolData(pippo));

		poppo = pippo != null ? pippo.longValue() : 0L;
	}

	protected static String toStringFromCobolData(Integer data) {
		return Optional.ofNullable(data).map(String::valueOf).orElse(" ");
	}

}
