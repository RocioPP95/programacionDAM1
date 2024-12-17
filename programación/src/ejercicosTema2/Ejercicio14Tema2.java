package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio14Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer x;
		Integer y = 0;
		Integer solucion;

		System.out.println("Dame un número");

		x = sc.nextInt();

		do {

			solucion = x * y;

			System.out.println(x + "x" + y + "=" + solucion);
			y = y + 1;
		} while (y <= 10);

		sc.close();
	}
}
