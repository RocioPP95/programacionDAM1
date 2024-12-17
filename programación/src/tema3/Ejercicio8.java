package tema3;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i;
		Integer cambio;
		System.out.println("¿Cuántos números nos vas a decir?");
		i = sc.nextInt();
		Integer[] numeros = new Integer[i];

		// llenar el array del 1 al i
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Introduce los números");
			Integer numero = sc.nextInt();
			numeros[i] = numero;
		}
		for (i = 0; i < numeros.length / 2; i++) {
			int j = numeros.length - i - 1;
			int a = numeros[i];
			int b = numeros[j];
			numeros[i] = b;
			numeros[j] = a;
		}
		// Imprimir lo que hat en el array
		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		sc.close();
	}
}
