package algoritmi;


public class TroncaStringa {
	
	public static void main(String[] args) {
		String ciccio = "AGENZIA DEL MOBILE ITALIANISSI";
		Integer max = 30;
		System.out.println(stringCut(ciccio, max));
		
	}

	public static String stringCut(String input, Integer max) {
		return input.length() > max ? input.substring(0, max) : input;
	}
	
	
}
