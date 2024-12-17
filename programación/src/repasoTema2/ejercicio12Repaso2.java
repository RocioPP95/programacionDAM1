package repasoTema2;

import java.util.Scanner;

public class ejercicio12Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer contador = 0;
		Integer linea = 0;
		Integer linea2 = 0;
		Integer linea3 = 0;

		System.out.println("Introduce un número mayor que cero");
		contador = sc.nextInt();

		for (linea = 0; linea < contador; linea++) {
			if (linea == 0) {
				System.out.print(" _");
			} else {
				System.out.print("__");
			}
		}
		System.out.println();
		for (linea3 = 0; linea3 < contador; linea3++) {

			for (linea2 = 0; linea2 < contador; linea2++) {

				System.out.print("|_");

			}
			System.out.print("|");
			System.out.println();

		}
		

		sc.close();
	}
}
