package repasoTema2;

import java.util.Scanner;

public class Ejercicio21Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n;
		do {
			System.out.println("Introduce un número");
			n = sc.nextInt();
			for (int i2 = 0; i2 < n; i2++) {
				System.out.println();
				for (int i = 0; i < n; i++) {
					if (i == i2) {
						System.out.print("* ");

					} else {
						System.out.print("- ");
					}
				}

			}
		} while (n < 0);

		sc.close();
	}
}
