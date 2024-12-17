package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio9Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombreCompleto;
		Integer x;
		Integer y;

		System.out.println("Su nombre completo:");
		nombreCompleto = sc.nextLine();
		x = nombreCompleto.indexOf(" ");
		String nombre = nombreCompleto.substring(0, x);
		y = nombreCompleto.lastIndexOf(" ");
		String apellido1 = nombreCompleto.substring((x + 1), y);
		String apellido2 = nombreCompleto.substring(y);

		System.out.println("Su nombre es  " + nombre + " su primer apellido es " + apellido1
				+ " su segundo apellido es " + apellido2);

		sc.close();
	}

}
