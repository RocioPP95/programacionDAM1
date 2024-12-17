package repasoTema2;

import java.util.Scanner;

public class Ejercicio3Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer opcion;
		do {
			System.out.println("***MENU***");
			System.out.println("1.Abrir");
			System.out.println("2.Guardar");
			System.out.println("3.Modificar");
			System.out.println("4.Salir");
			System.out.println("Elige una opción:");
			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.println("Abrir");
			} else if (opcion == 2) {
				System.out.println("Guardar");
			} else if (opcion == 3) {
				System.out.println("Modificar");
			} else if (opcion == 4) {
				System.out.println("Bye Bye");

			} else {
				System.out.println("Esa opción de menú no es correcta");
			}
		}

		while (opcion != 4);

		

		sc.close();

	}
}
