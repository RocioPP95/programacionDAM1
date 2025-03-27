package ej55Evaluacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Evaluacion {

	// Key = DNI --> Value = Nota
	Map<String, BigDecimal> notas;

	public Evaluacion() {
		notas = new HashMap<>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		if (notas.get(dni) != null) {
			return false;
		}
		notas.put(dni, nota);
		return true;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		return notas.getOrDefault(dni, BigDecimal.ZERO);
	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal nota : notas.values()) {
			suma = suma.add(nota);
		}
//			for (String dni : notas.keySet()) {
//				suma = suma.add(notas.get(dni));
//			}
//			for (Entry<String, BigDecimal> entry : notas.entrySet()) {
//				suma = suma.add(entry.getValue());
//			}
		return suma.divide(BigDecimal.valueOf(notas.size()));
	}

	public Integer obtenerCantidadAprobados() {
		Integer cont = 0;
		for (BigDecimal nota : notas.values()) {
			if (nota.compareTo(BigDecimal.valueOf(5)) >= 0) {
				cont++;
			}
		}
		return cont;
	}

	public List<String> obtenerSuspensos() {
		List<String> dnis = new ArrayList<>();
		for (String dni : notas.keySet()) {
			if (notas.get(dni).compareTo(BigDecimal.valueOf(5)) < 0) {
				dnis.add(dni);
			}
		}
		return dnis;
	}

	public void borrarAprobados() {
		notas.entrySet().removeIf(entry -> entry.getValue().compareTo(BigDecimal.valueOf(5)) >= 0);
	}

	@Override
	public String toString() {
		String aprobados = "";
		String suspensos = "";

		for (Entry<String, BigDecimal> entry : notas.entrySet()) {
			if (entry.getValue().compareTo(BigDecimal.valueOf(5)) < 0) {
				suspensos += "\n\t" + entry.getKey() + " (" + entry.getValue() + ")";
			} else {
				aprobados += "\n\t" + entry.getKey() + " (" + entry.getValue() + ")";
			}
		}
		if (aprobados.isEmpty()) {
			aprobados = "\n\tNinguno";
		}
		if (suspensos.isEmpty()) {
			suspensos = "\n\tNinguno";
		}

		return "Aprobados:" + aprobados + "\nSuspensos:" + suspensos;

	}
}
