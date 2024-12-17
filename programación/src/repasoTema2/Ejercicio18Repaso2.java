package repasoTema2;

import java.util.Scanner;

public class Ejercicio18Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		String palabra2 = null;
		System.out.println("Escribe una palabra");
		palabra = sc.nextLine();

		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabra2 = palabra2 + palabra.charAt(i); // i es la posición
			System.out.print(palabra.charAt(i));

		}
		sc.close();
	}
}
