package ej57ListaPalabras;

import java.math.BigDecimal;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
Map<String, List<String>> diccionario = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("Dime una palabra");
			palabra = sc.nextLine();
			String letra = palabra.split("")[0].toUpperCase();
			if (!palabra.equalsIgnoreCase("fin")) {
				List<String> palabras = diccionario.get(letra);
				if (palabras == null) {
					palabras = new ArrayList<>();
					diccionario.put(letra, palabras);
				}
				palabras.add(palabra);
			}
		} while (!palabra.equalsIgnoreCase("fin"));
		
		String letra;
		do {
			System.out.println("Dime una letra");
			letra = sc.nextLine().toUpperCase();
			if (!letra.equalsIgnoreCase("fin")) {
				if (diccionario.containsKey(letra)) {
					imprimeLista(letra, diccionario.get(letra));
				}
				else {
					System.out.println("No tengo palabras con esa letra");
				}
			}
		} while (!letra.equalsIgnoreCase("fin"));
		
		sc.close();
		
	}

	private static void imprimeLista(String letra, List<String> lista) {
		String cantidad = lista.size() + " palabra";
		if (lista.size()>1) {
			cantidad += "s";
		}
		System.out.println("Hay " + cantidad + " que empiezan por " + letra);
		for (String palabra : lista) {
			System.out.println("\t>" + palabra);
		}
	}
	
	
}
