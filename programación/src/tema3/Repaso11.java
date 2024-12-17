package tema3;

import java.util.Scanner;

public class Repaso11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String frase = "";
		Integer longitud = 0;
		Integer i = 0;
		Integer contador1 = 0;
		Integer contador2 = 0;
		do {

			System.out.println("Introduce la frase:");
			frase = sc.nextLine();
			//en el while pon lo que está bien y todo lo meto en !()
		} while (!(frase.endsWith(".") && frase.length() > 20));

		String[] array = frase.split(" ");
		for (i = 0; i < array.length; i++) {
			if (array[i].toLowerCase().startsWith("a")) {
				contador1++;
			} if (array[i].toLowerCase().startsWith("b")) {
				contador2++;
			}

		}
		System.out.print("Empiezan por a: " + contador1 + " ,empiezan por b: " + contador2);

		sc.close();
	}
}
