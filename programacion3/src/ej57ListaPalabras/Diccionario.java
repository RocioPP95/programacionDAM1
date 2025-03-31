package ej57ListaPalabras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> diccionario;

	public Diccionario(Map<String, List<String>> diccionario) {
		super();
		this.diccionario = new HashMap<>();
		
	}
	
	public void cargarDiccionario(List<String> palabras) {

		for (String palabra : palabras) {
		String letra = palabra.substring(0, 1).toUpperCase();

		palabras = diccionario.get(letra);

		if (palabras == null) {
		palabras = new ArrayList<>();
		diccionario.put(letra, palabras);
		}
		palabras.add(palabra);
		}

		}

		public void borrarDiccionario() {
		diccionario.clear();
		}

		public void imprimirPalabras(String letra) {

		if (diccionario.containsKey(letra)) {
		List<String> palabras = diccionario.get(letra);
		String cantidad = palabras.size() + " palabra";

		if (palabras.size() > 1) {
		cantidad += "s";
		}
		System.out.println("Hay " + cantidad + " que empiezan por " + letra + ":");
		for (String palabra : palabras) {
		System.out.println("\t>" + palabra);
		}
		} else {
		System.out.println("No hay palabras con esa letra.");
		}
		}


}
