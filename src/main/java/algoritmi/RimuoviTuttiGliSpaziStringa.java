package algoritmi;


public class RimuoviTuttiGliSpaziStringa {
	
	public static void main(String[] args) {
		String pippo = "djd dfki ";
		pippo = pippo.replaceAll("\\s+","");
		System.out.println(pippo);
	}

}
