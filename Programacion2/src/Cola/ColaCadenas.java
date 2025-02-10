package Cola;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	private List<String> listaCadenas;

	public ColaCadenas() {
		super();
		this.listaCadenas = new ArrayList<>();
	}

	public void añadirCadenA(String cadena) {
		this.listaCadenas.add(cadena);

	}

	public String sacarCadena() {
		return listaCadenas.remove(0);
	}

	public Integer getTamaño() {
		return listaCadenas.size();

	}

	@Override
	public String toString() {
		return "ColaCadenas [listaCadenas=" + listaCadenas + "]";
	}

}
