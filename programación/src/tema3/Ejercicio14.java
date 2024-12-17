package tema3;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine().toLowerCase();
		String[] parte = frase.split("");

		for (int i = 0; i < parte.length; i++) {
			if (parte[i].equals(" ")) {
				parte[i + 1] = parte[i + 1].toUpperCase();
			} else {
				System.out.print(parte[i]);

			}

			sc.close();
		}
	}
}