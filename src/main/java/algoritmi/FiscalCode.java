package algoritmi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiscalCode {

	public static void main(String[] args) {

		System.out.println(fiscalCodeValidate("VRDNDR86P28D976K"));

	}

	public static boolean fiscalCodeValidate(String codFiscale) {
		// controlla che sia tutto maiuscolo
		String regex = "^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$";

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(codFiscale);
		if(m.matches()) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean pIvaValidate(String pIva) {
		// controlla che sia tutto maiuscolo
		String regex = "[0-9]{11}";

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(pIva);
		if(m.matches()) {
			return true;
		} else {
			return false;
		}

	}

}
