package algoritmi;

public class SplitString {

	public static void main(String[] args) {
		String amountString = "Flora,Erminio,Ballanzasca";
		String[] array = amountString.split(",");

		System.out.println(array[0]);
	}
}
