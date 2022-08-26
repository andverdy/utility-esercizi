package algoritmi;

public class ReplaceAndSplitString {

	public static void main(String[] args) {
		Float totale = 3151.2700f;
		System.out.println(amountGenerate(totale));
	}

	public static String amountGenerate(Float amount) {
		String fixedPosAmount = null;
		if(amount != null) {
			String amountString = amount.toString();
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
				fixedPosAmount = intPart + decPart;
			} else {
				fixedPosAmount = intPart + "00000";
			}
		}
		return fixedPosAmount;
	}
}
