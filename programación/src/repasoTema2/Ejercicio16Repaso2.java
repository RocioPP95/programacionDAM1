package repasoTema2;

import java.util.Scanner;

public class Ejercicio16Repaso2 {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

		String palabra;
		Integer posicion;
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();


		for (posicion = 0; posicion < palabra.length(); posicion++) {

			System.out.println(palabra.charAt(posicion));// charAt se utiliza para obtener el carácter de la posicion que le indico en la variable


		}

		sc.close();
}
}
