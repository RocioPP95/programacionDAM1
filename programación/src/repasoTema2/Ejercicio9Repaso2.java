package repasoTema2;

import java.util.Scanner;

public class Ejercicio9Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		Integer cadenaInicio;
		Integer cadenaFin;
		String cadena;
		String cadena2;
		do {
			System.out.println("Introduce un texto");
			texto = sc.nextLine();
			if (texto.startsWith("hola") && texto.endsWith("adios")) {
				cadenaInicio = texto.indexOf(" ");
				cadenaFin = texto.lastIndexOf("a");
				cadena2 = texto.substring(cadenaInicio, cadenaFin);
				System.out.println("Lo hemos entendido. mensaje: " + cadena2);
				break;
			} else if (!(texto.startsWith("hola") && texto.endsWith("hastaluego"))) {
				System.out.println("No lo hemos entendido, repítelo otra vez");
			} else {

				cadenaInicio = texto.indexOf(" ");
				cadenaFin = texto.lastIndexOf("h");
				cadena = texto.substring(cadenaInicio, cadenaFin);
				System.out.println("Lo hemos entendido. mensaje: " + cadena);
			}

		} while (texto.startsWith("hola") && texto.endsWith("hastaluego"));

		sc.close();
	}
}
