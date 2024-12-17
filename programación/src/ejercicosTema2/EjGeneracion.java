package ejercicosTema2;

import java.util.Scanner;

public class EjGeneracion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuás es tu año de nacimiento?");

		Integer año = sc.nextInt();

		String mensaje = "";

		if (año >= 2010 && año <= 2020) {
			// lo siguiente es un syso
			mensaje = "Generación alfa";
		} else if (año >= 1997 && año <= 2012) {
			mensaje = "Generación Z";
		} else if (año >= 1981 && año <= 1996) {
			mensaje = "Generación Y";
		} else if (año >= 1965 && año <= 1980) {
			mensaje = "Generación X";
		} else if (año >= 1946 && año <= 1964) {
			mensaje = "Baby Boomers";
		} else if (año >= 1928 && año <= 1945) {
			mensaje = "Generación Silenciosa";
		} else if (año >= 2021 || año <= 1927) {
			mensaje = "No tines Generación";
		}

		System.out.println(mensaje);

		sc.close();

	}

}
