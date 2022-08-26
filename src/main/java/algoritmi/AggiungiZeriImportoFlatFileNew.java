package algoritmi;

public class AggiungiZeriImportoFlatFileNew {

	public static void main(String[] args) {
		Float totale = 3151.2700f;
		System.out.println(settaCifraDecimale(totale));
	}
	
	public static String settaCifraDecimale(Float totaleInput) {
		String totale = null;
		if(totaleInput != null) {
			String amountString = String.valueOf(totaleInput);
			amountString = amountString.replace(".", ",");
			String[] nums = amountString.split(",");

			String intPart = nums[0];
			while(intPart.length() < 15) {
				intPart = "0" + intPart;
			}
			if(nums.length > 1) {
				String decPart = nums[1];
				while(decPart.length() < 5) {
					decPart = "0" + decPart;
				}
				totale = intPart + decPart;
			} else {
				totale = intPart + "00000";
			}
		}
		return totale;
	}

//	public static String settaCifraDecimale(Float totaleInput) {
//		StringBuilder totaleASinistraDelPunto = new StringBuilder("000000000000000");
//		StringBuilder totaleADestraDelPunto = new StringBuilder("00000");
//		boolean isRigth = false;
//		if(Objects.nonNull(totaleInput)) {
//			StringBuilder totale = new StringBuilder();
//			totale.append(totaleInput.toString());
//			// Aggiungi le cifre a destra e sinistra senza il punto in 2 stringhe separate
//			for(int i = 0; i < totale.length(); i++) {
//				if(totale.charAt(i) != '.' && !isRigth) {
//					totaleASinistraDelPunto.append(totale.charAt(i));
//				} else {
//					isRigth = true;
//					if(totale.charAt(i) == '.') {
//						continue;
//					}
//					totaleADestraDelPunto.append(totale.charAt(i));
//				}
//			}
//			// Taglia gli zeri alla cifra di sinistra se supera il limite
//			if(totaleASinistraDelPunto.length() > 15) {
//				int differenza = totaleASinistraDelPunto.length() - 15;
//				for(int i = 0; i < differenza; i++) {
//					totaleASinistraDelPunto.deleteCharAt(i);
//				}
//			}
//			// Taglia gli zeri alla cifra di destra se supera il limite
//			if(totaleADestraDelPunto.length() > 5) {
//				int differenza = totaleADestraDelPunto.length() - 5;
//				for(int i = 0; i < differenza; i++) {
//					totaleADestraDelPunto.deleteCharAt(i);
//				}
//			}
//			totaleASinistraDelPunto.append(totaleADestraDelPunto);
//		} else { // Se il totale è null setta una cifra di default
//			totaleASinistraDelPunto.append(totaleADestraDelPunto);
//		}
//		return totaleASinistraDelPunto.toString();
//	}
}
