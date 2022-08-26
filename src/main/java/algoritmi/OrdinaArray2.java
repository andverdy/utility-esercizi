package algoritmi;

public class OrdinaArray2 {

	public static void main(String[] args) {
		int[] array = new int[] { 32, 22, 12, 3, 2, 0 };
		boolean scambio;

		do {
			scambio = false;
			for(int i = 0; i < array.length; i++) {
				if(i + 1 <= array.length - 1 && array[i + 1] < array[i]) {
					int min = array[i + 1];
					array[i + 1] = array[i];
					array[i] = min;
					scambio = true;
				}
			}
		} while(scambio);

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
