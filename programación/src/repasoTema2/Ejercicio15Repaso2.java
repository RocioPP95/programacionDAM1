package repasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(10);
		Integer num;
		Integer intento = 0;
		Integer puntuacion;
		System.out.println(aleatorio);

		do {

			System.out.println("Averigua el número:");
			num = sc.nextInt();
			intento++;

		} while (aleatorio != num && intento<10);
		puntuacion = 10 - intento;
		System.out.println("Puntuación obtenida= " + puntuacion);

		sc.close();
	}
}
