package map;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemploAMp {
	public static void main(String[] args) {

		// DECLARAR Y CREAR EL MAPA
		Map<String, BigDecimal> notas = new HashMap<>();

//Recorrer solo las keys
		Set<String> claves = notas.keySet();
		for (String clave : claves) {
			// imprime la clave
			System.out.println(clave);
			// imprime el valor de la clave
			System.out.println(notas.get(clave));
		}

		Set<Entry<String, BigDecimal>> entries = notas.entrySet();
		for (Entry<String, BigDecimal> entry : entries) {

			// obtener key
			System.out.println(entry.getKey());
			// obtener value
			System.out.println(entry.getValue());
		}

		// Recorrer sólo valores
		Collection<BigDecimal> valores = notas.values();
		for (BigDecimal valor : valores) {
			System.out.println(valor);
		}

	}
}
