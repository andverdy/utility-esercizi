package algoritmi;

public class TaglioStringa {

	public static void main(String[] args) {
		StringBuilder tmp = new StringBuilder(10);
		System.out.println(tmp.capacity());
		tmp.append("CL0002");
		System.out.println(tmp.capacity());
		System.out.println(tmp);
		for(int i = 0; i < tmp.length(); i++) {
			System.out.println(tmp.charAt(i));
		}

		// TAGLIO UNA STRINGA
		// String str = "abcdefghijklmnopqrtuvwxyz";
		// if (str.length() > 8)
		// str = str.substring(0, 8);
		// System.out.println(str + " " + str.length());
	}
}
