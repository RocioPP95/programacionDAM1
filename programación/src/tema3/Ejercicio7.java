package tema3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i;
		System.out.println("¿Cuántos números nos vas a decir?");
		i = sc.nextInt();
		Integer[] numeros = new Integer[i];
		Integer[] numerosInvertidos = new Integer[numeros.length];
		// llenar el array del 1 al i
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Introduce los números");
			Integer numero = sc.nextInt();
			numeros[i] = numero;
		}
		// lenar el aray del i al 1 (Esta variable servirá como índice para el segundo
		// array.

		for (i = 0; i < numerosInvertidos.length; i++) {
			int ultimo = numeros.length - i - 1;
			numerosInvertidos[ultimo] = numeros[i];
		}

		// Imprimir lo que hat en el array
		for (i = 0; i < numerosInvertidos.length; i++) {
			System.out.print(numerosInvertidos[i] + " ");
		}

		sc.close();
	}
}
