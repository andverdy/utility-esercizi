package algoritmi;

public class TryCatchFinally {

	public static void main(String[] args) {
		String pippo = null;

		try {
			System.out.println("sono nel try");
			@SuppressWarnings("null")
			String pippa = pippo.toUpperCase();
			System.out.println(pippa);
		} catch (Exception e) {
			System.out.println("sono nel catch");
			e.printStackTrace();
		}
		finally {
			System.out.println("sono nel finally");
		}
	}
}
