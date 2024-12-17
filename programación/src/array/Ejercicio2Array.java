package array;

import java.util.Scanner;

public class Ejercicio2Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer usuario;
		System.out.println("Introduce un número");
		usuario = sc.nextInt();
		Integer[] numeros = new Integer[6];
		// llenar el array del 1 al 6
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = usuario * usuario;
			usuario++;
		}
		// Imprimir lo que hat en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}

		sc.close();
	}
}
