package algoritmi;

public class Matrici {

	public static void main(String[] args) {
		int[][] matrice = { { 12, 10, 8, 11 }, { 5, 40, 63, 2 }, { 12, 30, 3, 1 }, { 6, 20, 8, 3 }

		};

		for(int i = 0; i < trovaPuntoDiSella(matrice).length; i++) {
			System.out.println("coordinata: " + trovaPuntoDiSella(matrice)[i]);
		}

//		for(int i = 0; i < matrice.length; i++) {
//			for(int j = 0; j < matrice.length; j++) {
//				System.out.println(matrice[i][j]);
//			}
//		}

	}

	public static int[] trovaPuntoDiSella(int[][] matrice) {
		int i = 0;
		int j = 0;
		int[] array = null;
		boolean trovato = false;
		int[] coordinate = new int[2];
		coordinate[0] = -1;
		coordinate[1] = -1;

		for(i = 0; i < matrice.length; i++) {
			array = new int[matrice[i].length];
			for(j = 0; j < matrice[i].length; j++) {
				array[j] = matrice[i][j];
			}
			int[] arrayMin = trovaMin(array);

			for(j = 0; j < matrice[i].length; j++) {
				array[j] = matrice[j][arrayMin[1]];
			}
			int[] arrayMax = trovaMax(array);

			if(arrayMin[0] == arrayMax[0]) {
				coordinate[0] = arrayMin[1];
				coordinate[1] = arrayMax[1];
				trovato = true;
				break;
			}
			if(trovato) {
				break;
			}
		}
		return coordinate;
	}

	public static int[] trovaMax(int[] array) {
		int posizioneMax = 0;
		int max = array[0];
		int[] valoriRitorno = new int[2];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				posizioneMax = i;
			}
		}
		valoriRitorno[0] = max;
		valoriRitorno[1] = posizioneMax;
		return valoriRitorno;
	}

	public static int[] trovaMin(int[] array) {
		int posizioneMin = 0;
		int min = array[0];
		int[] valoriRitorno = new int[2];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				posizioneMin = i;
			}
		}
		valoriRitorno[0] = min;
		valoriRitorno[1] = posizioneMin;
		return valoriRitorno;
	}

}
