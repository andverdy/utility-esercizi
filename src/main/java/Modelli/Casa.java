package Modelli;

import java.util.List;

public class Casa {

	private String nomeCasa;
	private String indirizzoCasa;
	private Long numCivicoCasa;
	private Long posizioneCasa;
	private List<Libro> libri;

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

	public String getNomeCasa() {
		return nomeCasa;
	}

	public void setNomeCasa(String nomeCasa) {
		this.nomeCasa = nomeCasa;
	}

	public String getIndirizzoCasa() {
		return indirizzoCasa;
	}

	public void setIndirizzoCasa(String indirizzoCasa) {
		this.indirizzoCasa = indirizzoCasa;
	}

	public Long getNumCivicoCasa() {
		return numCivicoCasa;
	}

	public void setNumCivicoCasa(Long numCivicoCasa) {
		this.numCivicoCasa = numCivicoCasa;
	}

	public Long getPosizioneCasa() {
		return posizioneCasa;
	}

	public void setPosizioneCasa(Long posizioneCasa) {
		this.posizioneCasa = posizioneCasa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indirizzoCasa == null) ? 0 : indirizzoCasa.hashCode());
		result = prime * result + ((libri == null) ? 0 : libri.hashCode());
		result = prime * result + ((nomeCasa == null) ? 0 : nomeCasa.hashCode());
		result = prime * result + ((numCivicoCasa == null) ? 0 : numCivicoCasa.hashCode());
		result = prime * result + ((posizioneCasa == null) ? 0 : posizioneCasa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		if(indirizzoCasa == null) {
			if(other.indirizzoCasa != null)
				return false;
		} else if(!indirizzoCasa.equals(other.indirizzoCasa))
			return false;
		if(libri == null) {
			if(other.libri != null)
				return false;
		} else if(!libri.equals(other.libri))
			return false;
		if(nomeCasa == null) {
			if(other.nomeCasa != null)
				return false;
		} else if(!nomeCasa.equals(other.nomeCasa))
			return false;
		if(numCivicoCasa == null) {
			if(other.numCivicoCasa != null)
				return false;
		} else if(!numCivicoCasa.equals(other.numCivicoCasa))
			return false;
		if(posizioneCasa == null) {
			if(other.posizioneCasa != null)
				return false;
		} else if(!posizioneCasa.equals(other.posizioneCasa))
			return false;
		return true;
	}

	

}
