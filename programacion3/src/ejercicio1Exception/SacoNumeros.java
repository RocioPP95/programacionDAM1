package ejercicio1Exception;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {

	private List<Integer> numeros;

	public SacoNumeros() {
		super();
		this.numeros = new ArrayList<>();
	}

	public void addNumero(Integer numero) {

		this.numeros.add(numero);
	}

	@Override
	public String toString() {
		return "SacoNumeros [ " + numeros + " " + "]";
	}

	public Integer getNumero(Integer posicion) {
		try {
			return numeros.get(posicion);

		} catch (Exception e) {
			return null;
		}

	}

	public BigDecimal division() {
		BigDecimal resultado = BigDecimal.ZERO;
		for (int i = 0; i < this.numeros.size(); i++) {
			try {
				resultado = BigDecimal.valueOf(numeros.get(i)).divide(BigDecimal.valueOf(numeros.get(i + 1)), 2,
						RoundingMode.HALF_UP);
				return resultado;
			} catch (Exception e) {
				return resultado;
			}

		}
		return resultado;

	}
}
