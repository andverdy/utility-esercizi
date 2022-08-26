package algoritmi;

public class OrdinaArray {

	public static void main(String[] args) {

		int[] array = new int[] { 3, 6, 5, 9, 7, 0 };
		int temp = 0;
		boolean scambio = false;

		for(int j = 0; j < array.length - 1; j++) {
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i + 1] < array[i]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					scambio = true;
				}
			}
			if(!scambio) {
				break;
			}
			scambio = false;
		}

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
