package repasoTema2;

import java.util.Scanner;

public class Ejercicio1Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		Integer año;

		System.out.println("Escribe tu nombre");
		nombre = sc.nextLine();

		System.out.println("Escribe tu año de nacimiento");
		año = sc.nextInt();

		Integer resultado = 2030 - año;

		System.out.println("Hola " + nombre + " en el año 2030 tendrás " + resultado + " años");
		sc.close();
	}
}
