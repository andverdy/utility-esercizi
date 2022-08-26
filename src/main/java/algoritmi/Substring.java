package algoritmi;

public class Substring {

	public static void main(String[] args) {
		// preleva la stringa dalla posizione 8 alla fine
		String ciccio = "pippomestriello";
		String cioa = ciccio.substring(8);
		System.out.println(cioa);

		// preleva la stringa dalla posizione 0 alla 8
		String ciccio2 = "pippomestriello";
		String cioa2 = ciccio2.substring(0, 8);
		System.out.println(cioa2);
	}
}
