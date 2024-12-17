package tema3;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i;
		System.out.println("¿Cuántos números nos vas a decir?");
		i = sc.nextInt();
		Integer[] numeros = new Integer[i];

		// llenar el array del 1 al i
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Introduce los números");
			Integer numero = sc.nextInt();
			numeros[i] = numero;

		}
		Integer max = numeros[0];
		Integer min =numeros[0];
		// Imprimir lo que hay en el array
		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			if (numeros[i] > max) {
				max = numeros[i];

			} else if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		System.out.println("El número mayor es el " + max);
		System.out.println("El número menor es el " + min);

		sc.close();
	}
}
