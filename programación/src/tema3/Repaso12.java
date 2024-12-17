package tema3;

import java.util.Scanner;

public class Repaso12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?: ");
		String nombre = sc.nextLine();

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();
		Integer cantidadLetras = contarLetras(frase, "T");

		sc.close();
	}

//Esto es un metodo para que me haga  todo lo que le guarde
	public static Integer contarLetras(String frase, String letra) {

		Integer contador = 0;
		String[] array = frase.split("");

		for (String string : array) {
			if (string.toLowerCase().equals(letra)) {
				contador++;

			}
		}
		// devuelveme el contador fuera del main
		return contador;

	}

}
