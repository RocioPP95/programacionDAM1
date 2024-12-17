package repasoTema2;

import java.util.Scanner;

public class Ejercicio17Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n;
		Integer i;
		Integer a = 0;
		Integer b = 1;
		Integer siguiente;

		do {

			System.out.println("Introduce un número");
			n = sc.nextInt();

		} while (n <= 2);
		System.out.print("0,1,");
		for (i = 2; i < n; i++) {

			siguiente = a + b;
			a = b;
			b = siguiente;

			System.out.print(siguiente + ",");

		}

		sc.close();
	}
}
