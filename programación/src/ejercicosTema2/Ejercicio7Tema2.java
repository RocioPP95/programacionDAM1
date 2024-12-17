package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio7Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer num1 = 0;
		Integer num2 = 1;

		// mientras no sean iguales sigue pidiendo
		while (num1 != num2) {
			System.out.println("Dame un número");
			num1 = sc.nextInt();
			System.out.println("Dame otro número");
			num2 = sc.nextInt();

		}
		// por lo contraRIO, en el momento que sean iguales , pasa el while y baja a la
		// siguiente que este syso
		System.out.println("Un saludo");

		sc.close();
	}

}
