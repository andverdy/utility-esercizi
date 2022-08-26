package Modelli;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica<T> {

	private String nome;

	private List<T> list = new ArrayList<T>();

	public Integer sommma(T t) {
		Integer valGener = (Integer) t;
		return valGener + 10;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
