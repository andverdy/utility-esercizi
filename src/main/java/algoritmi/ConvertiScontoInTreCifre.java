package algoritmi;

public class ConvertiScontoInTreCifre {

	public static void main(String[] args) {

		// col 94-96 = percentuale sconto (100 per 100%, 000 per 0% e 068 per 68%)
		Integer sconto = 68;
		String scontoString = Integer.toString(sconto);
		if(scontoString.length() == 1) {
			scontoString = "00" + scontoString;
		} else if(scontoString.length() == 2) {
			scontoString = "0" + scontoString;
		}

		System.out.println("stampa lo sconto converito: " + scontoString);
	}
}
