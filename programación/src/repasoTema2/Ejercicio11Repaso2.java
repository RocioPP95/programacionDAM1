package repasoTema2;

import java.util.Scanner;

public class Ejercicio11Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer resultado;

		Integer operacion;

		do {

			System.out.println("escribe un número");
			Integer num1 = sc.nextInt();
			System.out.println("escribe otro número");
			Integer num2 = sc.nextInt();
			System.out.println("*** MENÚ ***");
			System.out.println("  1.Sumar");
			System.out.println("  2.Restar");
			System.out.println("  3.Multiplicar");
			System.out.println("  4.Dividir");
			System.out.println("  0.Salir");
			System.out.println("elige operación");
			operacion = sc.nextInt();

			if (operacion == 1) {
				resultado = num1 + num2;
				System.out.println(resultado);
			} else if (operacion == 2) {
				resultado = num1 - num2;
				System.out.println(resultado);
			} else if (operacion == 3) {
				resultado = num1 * num2;
				System.out.println(resultado);
			} else if (operacion == 4) {
				resultado = num1 / num2;
				System.out.println(resultado);
				if (num2 == 0) {
					System.out.println("la división no es posible");
				}
			}

		} while (operacion != 0);
		sc.close();
	}
}
