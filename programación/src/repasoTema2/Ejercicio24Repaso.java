package repasoTema2;

import java.util.Scanner;

public class Ejercicio24Repaso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Integer impares = 0;

		do {
			System.out.print("Introduce un número mayor a 0: ");
			numero = sc.nextInt();
		} while (numero < 0);
		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 1) {
				impares = impares + i;
			}
		}
		System.out.println("La suma de todos los números impares hasta el " + numero + " es: " + impares);
		sc.close();
	}
}
