package tema3;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabra;
		System.out.println("Escribe una palabra");
		palabra = sc.nextLine();
		String[] letras = palabra.split("");
		Integer ultima = letras.length - 1;
		// hay que poner >=0 para que vaya restando puestos hasta que llegue al cero que
		// es la primera letra
		for (int i = ultima; i >= 0; i--) {

			System.out.print(letras[i]);
		}

		sc.close();

	}
}
