package algoritmi;

import java.text.DecimalFormat;

public class AggiungiSpaziVuotiStringa {
	
	public static void main(String[] args) {
		int numero = 10;
		StringBuilder sb = new StringBuilder();
		sb.append("lillo" + String.format("%-"+numero+"s", " "));
		String cino = String.format("%-"+numero+"s", " ");
		cino += "millo";
		
		DecimalFormat formatter = new DecimalFormat("#,###");
		System.out.println(formatter.format(100000));
		String pippo = "00000DWSENORB";
		pippo+= String.format("%-20s", " ");
		System.out.println(pippo);
//		StringUtils.leftPad(String str, int size)
//		StringUtils.rightPad(String str, int size)
	}
	
	

}
