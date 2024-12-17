package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio11Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// las variables que se utilizan en el while siempre declararla fuera

		String email;
		Integer x;
		String email1;

		do {
			System.out.println("Introduce email: ");
			email = sc.nextLine();
			x = email.lastIndexOf("@");
			email1 = email.substring((x + 1));

		} while (!(email.contains("@") && !email.endsWith(".") && email1.contains(".")));

		System.out.println("Terminado");
		sc.close();
	}
}
