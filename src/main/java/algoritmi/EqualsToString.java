package algoritmi;

public class EqualsToString {

	public Integer lato = 5;
	public String saluto = "ciao";

	public Integer getLato() {
		return lato;
	}

	public void setLato(Integer lato) {
		this.lato = lato;
	}

	public String getSaluto() {
		return saluto;
	}

	public void setSaluto(String saluto) {
		this.saluto = saluto;
	}

	public boolean equalsCustom(Object obj) {
		if(!(obj instanceof EqualsToString))
			return false;

		EqualsToString e = (EqualsToString) obj;

		if(this.lato.equals(e.getLato()) && this.saluto.equals(e.getSaluto())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "lato= " + lato;
	}

	public static void main(String[] args) {
		EqualsToString quadrato2 = new EqualsToString();
		EqualsToString quadrato3 = new EqualsToString();
		quadrato3.setSaluto("ippo");
		Quadrato1 quadrato1 = new Quadrato1();
		System.out.println(quadrato1);
		System.out.println(quadrato2.equalsCustom(quadrato3));

	}

	public static class Quadrato1 {

		public Integer lato = 5;

		public String saluto = "ciao";

		public Integer getLato() {
			return lato;
		}

		public void setLato(Integer lato) {
			this.lato = lato;
		}

		public String getSaluto() {
			return saluto;
		}

		public void setSaluto(String saluto) {
			this.saluto = saluto;
		}

		public boolean equals(Object obj) {
			if(!(obj instanceof Quadrato1))
				return false;

			Quadrato1 e = (Quadrato1) obj;

			if(this.lato.equals(e.getLato())) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public String toString() {
			return "lato= " + this.lato + ", " + "saluta= " + this.saluto;
		}

	}

}
