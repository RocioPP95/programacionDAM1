package repasoTema2;

import java.util.Scanner;

public class Ejercicio10Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String web;
		String protocolo;
		Integer barras;
		Integer primerPunto;
		String parte1;
		Integer segundoPunto;
		String parte2;
		String parte3;

		System.out.println("Introduce dirección web: ");
		web = sc.nextLine();
		barras = web.indexOf("w");
		primerPunto = web.indexOf(".");
		segundoPunto = web.lastIndexOf(".");
		protocolo = web.substring(0, barras);

		if (barras != -1 && primerPunto !=-1 && segundoPunto > primerPunto) {

			System.out.println(protocolo);
			parte1 = web.substring(barras, primerPunto);
			System.out.println(parte1);
			parte2 = web.substring(primerPunto + 1, segundoPunto);
			System.out.println(parte2);
			parte3 = web.substring(segundoPunto + 1);
			System.out.println(parte3);

		} else {
			System.out.println("El formato de la URL no es correcta.");
		}

		sc.close();

	}
}
