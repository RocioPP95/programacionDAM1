package tema3;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número:");
		Integer numero = sc.nextInt();
		String[] digitos = numero.toString().split("");

		Boolean esCapicua = true;
		Integer dcha = digitos.length - 1;
		for (int izda = 0; izda < digitos.length; izda++) {
			if (!digitos[izda].equals(digitos[dcha])) {
				esCapicua = false;
			}
			dcha--;
		}

		if (!esCapicua) {
			System.out.println("Es capicúa!!");
		} else {
			System.out.println("No es capicúa :(");
		}

		sc.close();
	}

}
