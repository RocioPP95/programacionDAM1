package repasoTema2;

import java.util.Scanner;

public class Ejercicio7Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		Integer numerofijo;
		Integer suma = 0;
		do {

			System.out.println("Escribe un número");
			numerofijo = sc.nextInt();

			if (numerofijo < 0 || numerofijo > 10) {
				System.out.println("el número no es correcto");
			} else if (numerofijo !=0) {
				 numero = 0;
				while (numero < numerofijo * 10) {

					numero = numero + numerofijo;
					if (numero == numerofijo*10) {
						System.out.print(numero);
					}
					else {
						System.out.print(numero + "+");
					}
					suma = suma + numero;

				}

				System.out.println("=" + suma);
			}
		} while (numerofijo != 0);
		sc.close();
	}
}
