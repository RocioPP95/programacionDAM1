package repasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String opcion = " ";
		String respuesta = " ";
		Integer victorias = 0;

		do {
			Integer aleatorio = random.nextInt(1, 4);

			do {
				System.out.println("Piedra, papel, tijeras… un, dos, tres… ya!!:");
				opcion = sc.nextLine();
			}
			while(!(opcion.equalsIgnoreCase("piedra") || opcion.equalsIgnoreCase("papel") ||  opcion.equalsIgnoreCase("tijeras")));
			
			
			System.out.println("La opción de la computadora es: " + aleatorio + " (1.Piedra, 2.Papel, 3.tijeras)");

			if (opcion.equalsIgnoreCase("piedra") && aleatorio == 1 || opcion.equalsIgnoreCase("papel") && aleatorio == 2
					|| opcion.equalsIgnoreCase("tijeras") && aleatorio == 3) {
				System.out.println("--Empate--");
			} else if (opcion.equalsIgnoreCase("piedra") && aleatorio == 2 || opcion.equalsIgnoreCase("papel") && aleatorio == 3
					|| opcion.equalsIgnoreCase("tijeras") && aleatorio == 1) {
				System.out.println("--Has perdido--");
			} else if (opcion.equalsIgnoreCase("piedra") && aleatorio == 3 || opcion.equalsIgnoreCase("papel") && aleatorio == 1
					|| opcion.equalsIgnoreCase("tijeras") && aleatorio == 2) {
				System.out.println("--Has ganado--");
				victorias++;
			}
			System.out.println("¿Deseas terminar?");
			respuesta = sc.nextLine();

		} while (respuesta.equals("no"));

		System.out.println("Tu puntuación es de: " + victorias);

		sc.close();
	}
}
