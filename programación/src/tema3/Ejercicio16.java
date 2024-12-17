package tema3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase bonita:");
		String frase = sc.nextLine();

		String[] letras = frase.split("");
		String[] palabras = frase.split(" ");
		Integer contador = 0;
		for (String letra : letras) {
			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("á")) {
				contador++;
			}
		}

		sc.close();
	}
}
