package ejercicio1Exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SacoNumeros saco = new SacoNumeros();

		Integer numero = 0;

		while (numero != -1) {
			System.out.println("Introduce numeros enteros:");
			try {
				numero = sc.nextInt();
				if (numero != -1) {
					saco.addNumero(numero);
				}

			} catch (InputMismatchException e) {
				System.out.println("No puedes introducir letras ");
				sc.nextLine();
			}
		}
		System.out.println(saco.toString());

		Integer posicion = 0;
		while (posicion != -1) {
			System.out.println("¿Qué números quieres ver? introduce la posición");
			posicion = sc.nextInt();
			System.out.println(saco.getNumero(posicion));

		}
		System.out.println(saco.division());

		sc.close();

	}
}
