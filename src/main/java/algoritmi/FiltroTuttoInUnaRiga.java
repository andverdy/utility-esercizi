package algoritmi;

import java.util.Optional;

public class FiltroTuttoInUnaRiga {

	public static void main(String[] args) {
		String[] array = new String[] { "1", "2", "3", "4", "5" };
		Boolean enableEgon = Boolean.parseBoolean(Optional.ofNullable(array).filter(x -> x.length > 3).map(x -> x[3]).orElse(Boolean.TRUE.toString()));
		System.out.println(enableEgon);

	}

}
