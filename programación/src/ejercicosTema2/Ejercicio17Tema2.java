package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio17Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuál es tu nombre?");
		String nombre = sc.next();

		for (Integer contador = 1; contador <= 5; contador++) {

			System.out.println("Mi nombre es " + nombre + ". Línea " + contador);
		}

		sc.close();
	}
}
