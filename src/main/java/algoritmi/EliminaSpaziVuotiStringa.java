package algoritmi;

public class EliminaSpaziVuotiStringa  {

	String ddd = "";
	Long cici = 0L;

	// public static void main(String[] args) throws IllegalArgumentException,
	// IllegalAccessException {
	//
	// String aaa = "pinco- pallino- ottuso";
	// Long lll = 459000L;
	// Libro libro = new Libro();
	//
	// String ddd = STRING_DEFAULT;
	// System.out.println(stringCut("sdvsf", 3));
	// // char[] ccc = aaa.toCharArray();
	//
	//// String sequence_sqadesione = "0112000002012534";
	//// String data = "0383726459345";
	////
	//// System.out.println(sequenceSqadesioneCut(sequence_sqadesione, 13));
	// }

	public static void main(String[] args) {
		
		String pippo = "     ciccillo  piedone";
		System.out.println("rimuovi spazi iniziali e finali " + pippo.trim());
		
		
		pippo = pippo.replace(" " , "");
		System.out.println("rimuovi spazi in tutta la stringa " + pippo);
		// Long pipo = 3212L;
		// String pipopo = null;
		//
		// if (pipo != null) {
		// pipopo = String.format("0000","%-3s", pipo);
		// }else {
		// pipopo = String.format("0000","%-3s", "0");
		// }
		// System.out.println(pipopo);

		//int number = 1500;

		// String format below will add leading zeros (the %0 syntax)
		// to the number above.
		// The length of the formatted string will be 7 characters.
		//String str = null;
		//str = StringUtils.leftPad(str, 10, "0");

		// String ecId = "234";
		//
		//
		// if (ecId instanceof String ) {
		// System.out.println("sono un numero Stringa");
		// } else {
		// System.out.println("sono numero");
		// }
		
//String ecid = " ";
//
//System.out.println(ecid.isEmpty());
//System.out.println(ecid.isBlank());
	

	}

	public static String stringCut(String field, Integer index) {
		String result = "";
		if (field.length() > index) {
			result = field.substring(0, index);
			return result;
		} else {
			result = field;
			return result;
		}
	}

	public static String sequenceSqadesioneCut(String field, int index) {
		String result = "";
		Integer difference = 0;

		if (field.length() > index) {
			difference = field.length() - index;
			result = field.substring(difference, field.length());
			return result;
		} else {
			result = field;
			return result;
		}
	}

	// public static void ccc(Object obj) {
	// while (obj.getBank_detail().size() < Occurrences.BANK_DETAIL.getSize()) {
	// obj.getBank_detail().add(new BANK_DETAIL());
	// }
	// }

	// public static void ccc(Object ob1, Object ob2, Enum enum,
	// CobolMasterdataObjectResponseAdapter cbMsObRespAdapt) {
	// while (obj.getBank_detail().size() < Occurrences.BANK_DETAIL.getSize()) {
	// obj.getBank_detail().add(new BANK_DETAIL());
	// }
	// }

}
