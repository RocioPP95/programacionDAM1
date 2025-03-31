import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Geografia {
	private Map<String, String> paises;

	public Geografia() {
		super();
		this.paises = new HashMap<>();
	}

	public Boolean agregarPais(String pais, String capital) {
		String pais2 = pais.toUpperCase();
		String capital2 = capital.substring(0, 1).toUpperCase() + capital.substring(1).toLowerCase();

		if (paises.containsKey(pais2)) {
			paises.put(pais2, capital2);
			return true;
		} else
			paises.put(pais2, capital2);
		return false;

	}

	public String obtenerCapital(String pais) {
		if (paises.containsKey(pais.toUpperCase())) {
			return paises.get(pais);
		} else
			return "";
	}
	// tambien podria see return paises.getOrdefalut(pais.toUpperCase(),"");

	public void imprimirPaises() {

		for (Map.Entry<String, String> entry : paises.entrySet()) {

			System.out.println("PAIS: " + entry.getKey() + "\n – CAPITAL: " + entry.getValue());
		}
	}

	public void eliminarPais(String pais) {
		paises.entrySet().removeIf(key -> key.equals(pais.toUpperCase()));
	}

	public BigDecimal calcularLongitudMediaPaises() {
		if (paises.isEmpty() || paises == null) {
			return BigDecimal.ZERO;
		}

		BigDecimal suma = BigDecimal.ZERO;

		for (String pais : paises.keySet()) {

			suma = suma.add(BigDecimal.valueOf(pais.length()));

		}
		return suma.divide(BigDecimal.valueOf(paises.size()), 2, RoundingMode.HALF_UP);
	}

	public void eliminarPaisConCapitalLetra(String letra) {

		// final boolean[] eliminado = {false};
		// paises.entrySet().removeIf(entry -> !eliminado[0] &&
		// entry.getValue().startsWith(letra.toUpperCase()) && (eliminado[0] = true));

		Iterator<String> it = paises.keySet().iterator();
		while (it.hasNext()) {
			String pais = it.next();
			if (paises.get(pais).startsWith(letra.toUpperCase())) {
				it.remove();
				break;
			}

		}

	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador = 0;

		for (String pais : paises.values()) {
			if (pais.startsWith(letra.toUpperCase())) {
				contador++;
			}
		}

		return contador;
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		for (Entry<String, String> entry : paises.entrySet()) {

			if (entry.getValue().startsWith(letra.toUpperCase())) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}
		System.out.println("Ninguna capital del mapa comienza por la letra " + letra.toUpperCase());

	}

	public void mismaLetra() {
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			if (entry.getKey().substring(0, 1).equals(entry.getValue().substring(0, 1))) {
				imprimirPaises();
			}
		}
	}

	public Map<String, String> getPaises() {
		return paises;
	}

}
