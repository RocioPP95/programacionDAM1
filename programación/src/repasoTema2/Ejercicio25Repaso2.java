package repasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25Repaso2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(1, 4);
		String opcion = " ";
		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!:");

		opcion.equalsIgnoreCase("");
		opcion = sc.nextLine();

		System.out.println("La opción de la computadora es: " + aleatorio + " (1.Piedra, 2.Papel, 3.tijeras)");

		if (opcion.equals("piedra") && aleatorio == 1 || opcion.equals("papel") && aleatorio == 2
				|| opcion.equals("tijeras") && aleatorio == 3) {
			System.out.println("--Empate--");
		} else if (opcion.equals("piedra") && aleatorio == 2 || opcion.equals("papel") && aleatorio == 3
				|| opcion.equals("tijeras") && aleatorio == 1) {
			System.out.println("--Has perdido--");
		} else if (opcion.equals("piedra") && aleatorio == 3 || opcion.equals("papel") && aleatorio == 1
				|| opcion.equals("tijeras") && aleatorio == 2) {

			System.out.println("--Has ganado--");

		}

		sc.close();
	}
}
