package pila;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	private List<String> litaCadenas;

	public PilaCadenas() {
		super();
		this.litaCadenas = new ArrayList<>();
	}

	public void a�adirCadena(String cadena) {
		this.litaCadenas.add(cadena);

	}

	public String sacarCadena() {
		return this.litaCadenas.remove(this.litaCadenas.size() - 1);
	}

	public Integer getTama�o() {
		return this.litaCadenas.size();

	}

	@Override
	public String toString() {
		return "PilaCadenas [litaCadenas=" + litaCadenas + "]";
	}

}