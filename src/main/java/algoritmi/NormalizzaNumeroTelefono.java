package algoritmi;

public class NormalizzaNumeroTelefono {

	public static void main(String[] args) {
		String campo = "//622cb//d dva6b3b37//";
		StringBuilder sb = new StringBuilder(campo);
		
		for(int i = 0; i < sb.length();) {
			if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9' || sb.charAt(i) == '+') {
				i++;
			} else {
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb.toString());
	}
}
