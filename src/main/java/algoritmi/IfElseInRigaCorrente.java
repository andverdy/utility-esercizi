package algoritmi;

import java.util.Objects;

public class IfElseInRigaCorrente {

	public static void main(String[] args) {

		int i = 1314;

		int p = 223;

		// se i è > di zero, p > di zero e se i è > di p ritorna 5 altrimenti 6
		int temp = i > 0 && p > 0 && i > p ? 5 : 6;

		Boolean result = i > p ? Boolean.TRUE : Boolean.FALSE;
		System.out.println(result);
		System.out.println(temp);
		
		Integer pippo = 23112;
		String ennolo = "bitonto";

		String ciao = pippo > 0 && pippo == 23112 && Objects.nonNull(ennolo) ? String.valueOf(pippo) : String.valueOf(4784);
		System.out.println(ciao);

	}

}
