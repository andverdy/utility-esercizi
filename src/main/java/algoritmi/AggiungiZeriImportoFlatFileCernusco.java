package algoritmi;



public class AggiungiZeriImportoFlatFileCernusco {
// da controllare
	public static void main(String[] args) {
		Float amount = 3102051.27f;

		String finalAmount = null;
		if (amount != null) {
			String amountString = amount.toString();
			int sizeAmountBeforeComma = 0;
			int sizeAmountAfterComma = 0;
			int index = 0;
			boolean pass = false;
			finalAmount = "";

			// ricavo la quantità di cifre che ci sono prima e dopo il punto
			if (!amountString.isEmpty()) {
				for (int i = 0; i < amountString.length(); i++) {
					if (amountString.charAt(i) != '.') {
						sizeAmountBeforeComma++;
					} else {
						break;
					}
					index = i;
				}
				index++;
				for (int i = index; i < amountString.length(); i++) {
					if (amountString.charAt(i) == '.' || pass == true) {
						pass = false;
						i++;
					}
					if (amountString.charAt(i) != '.') {
						sizeAmountAfterComma++;
					}
				}
			}
			// converto l'importo concatenando la cifra con gli "0"
			String zerosForIntegerNumbers = "000000000";
			String zerosForDecimalNumber = "00";

			if (sizeAmountBeforeComma == 6) {
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 6);
			}
			if (sizeAmountBeforeComma == 5) {
				zerosForIntegerNumbers += "0";
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 5);
			}
			if (sizeAmountBeforeComma == 4) {
				zerosForIntegerNumbers += "00";
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 4);
			}
			if (sizeAmountBeforeComma == 3) {
				zerosForIntegerNumbers += "000";
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 3);
			}
			if (sizeAmountBeforeComma == 2) {
				zerosForIntegerNumbers += "0000";
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 2);
			}
			if (sizeAmountBeforeComma == 1) {
				zerosForIntegerNumbers += "00000";
				finalAmount += zerosForIntegerNumbers;
				finalAmount += amountString.substring(0, 1);
			}

			// concatenazione numeri decimali
			if (sizeAmountAfterComma >= 3) {
				finalAmount += zerosForDecimalNumber;
				finalAmount += amountString.substring(sizeAmountBeforeComma + 1, sizeAmountBeforeComma + 4);

			} else if (sizeAmountAfterComma == 2) {
				zerosForDecimalNumber += "0";
				finalAmount += zerosForDecimalNumber;
				finalAmount += amountString.substring(sizeAmountBeforeComma + 1, sizeAmountBeforeComma + 3);
			} else {
				zerosForDecimalNumber += "00";
				finalAmount += zerosForDecimalNumber;
				finalAmount += amountString.substring(sizeAmountBeforeComma + 1, sizeAmountBeforeComma + 2);
			}
		}
		System.out.println(finalAmount);

	}
}
