package tema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[3];
		String palabra;
		// llenar el array del 1 al 3
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Introduce la palabra:");
			palabra = sc.nextLine();
			palabras[i] = palabra;
		}
		// Imprimir lo que hay en el array
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");

		}
		sc.close();
	}
}
