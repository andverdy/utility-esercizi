package algoritmi;


public class SubStringExample {
	public static void main(String[] args) {
		String pippo = "0181770000";
		
		String cicio = pippo.substring(0, 3);
		String emmo = pippo.substring(3, 6);
		String pino = pippo.substring(6, pippo.length());
		System.out.println(cicio);
	}
}
