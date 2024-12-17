package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio4Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer num = 0;

		Integer total = 0;

		do {
			System.out.println("Dame un número");
			num = sc.nextInt();

			total = (num + total);

		} while (num != 0);

		System.out.println("El total de todos los números es " + total);

		sc.close();

	}

}
