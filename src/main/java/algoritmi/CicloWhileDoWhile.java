package algoritmi;

import java.util.Arrays;
import java.util.List;

public class CicloWhileDoWhile {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(23,34,11,21,1,55);
		
		int index = 6;
		
		// differenze tra il do while ed il for
		// nel primo ci entra almeno una volta nel secondo no se la condizione è falsa
		do {
			System.out.println("sono entrato nel primo ciclo");
			for(int i = index; i < lista.size(); i++) {
				System.out.println("sono entrato nel secondo ciclo");
			}
			index++;
		} while(index < lista.size());
		
		
		
		
	}

}
