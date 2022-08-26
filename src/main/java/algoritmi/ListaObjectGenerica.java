package algoritmi;

import java.util.ArrayList;
import java.util.List;

public class ListaObjectGenerica {

	public static void main(String[] args) {

		List<Pintone> list = new ArrayList<>();
		// creare un nuov oggetto Pintone e inserirlo nella lista
		for(Object object : list) {
			System.out.println(object);
		}

	}

	public class Pintone {

		private String nome;
		private Integer eta;
		private Long codice;
		private boolean flag;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getEta() {
			return eta;
		}

		public void setEta(Integer eta) {
			this.eta = eta;
		}

		public Long getCodice() {
			return codice;
		}

		public void setCodice(Long codice) {
			this.codice = codice;
		}

		public boolean getFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}

	}
}
