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
		if (numeros.isEmpty()) {
			return BigDecimal.ZERO;

		}

		BigDecimal division = BigDecimal.valueOf(numeros.getFirst());
		for (int i = 1; i < this.numeros.size(); i++) {
			try {
				BigDecimal nextDivisisor = BigDecimal.valueOf(numeros.get(i));
				division = division.divide(nextDivisisor, 2, RoundingMode.HALF_UP);

			} catch (Exception e) {
				return BigDecimal.ZERO;
			}

		}

		return division;
	}
}
