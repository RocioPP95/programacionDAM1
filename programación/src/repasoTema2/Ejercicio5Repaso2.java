package repasoTema2;

import java.util.Scanner;

public class Ejercicio5Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 1;

		do {
			System.out.print(numero + "_");
			numero++;
		} while (numero <= 19);

		System.out.println("20");

		sc.close();

	}
}
