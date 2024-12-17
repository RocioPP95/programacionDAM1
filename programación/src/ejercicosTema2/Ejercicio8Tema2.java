package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio8Tema2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palabra1;
		String palabra2;

		do {
			System.out.println("Dame una palabra");
			palabra1 = sc.nextLine();
			palabra1 = palabra1.trim();

			System.out.println("Dame otra palabra");
			palabra2 = sc.nextLine();
			palabra2 = palabra2.trim();
			if (!palabra1.equalsIgnoreCase(palabra2)) {
				
			}
		} while (palabra1.equalsIgnoreCase(palabra2));

		System.out.println("Las palabras son iguales");

		sc.close();

	}
}
