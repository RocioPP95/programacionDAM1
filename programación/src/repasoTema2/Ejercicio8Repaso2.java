package repasoTema2;

import java.util.Scanner;

public class Ejercicio8Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		Integer cadenaInicio;
		Integer cadenaFin;
		String cadena;
		do {
			System.out.println("Introduce un texto");
			texto = sc.nextLine();
			if (!(texto.startsWith("hola") && texto.endsWith("hastaluego"))) {
				System.out.println("No lo hemos entendido, repítelo otra vez");
			} else {

				cadenaInicio = texto.indexOf(" ");
				cadenaFin = texto.lastIndexOf("h");
				cadena = texto.substring(cadenaInicio, cadenaFin);
				System.out.println("Lo hemos entendido. mensaje: " + cadena);
			}

		} while (!(texto.startsWith("hola") && texto.endsWith("hastaluego")));

		sc.close();
	}
}
