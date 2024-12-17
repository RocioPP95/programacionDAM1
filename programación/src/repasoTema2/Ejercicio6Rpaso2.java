package repasoTema2;

import java.util.Scanner;

public class Ejercicio6Rpaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		Integer suma = 0;

		while (numero <= 27) {

			numero = numero + 3;
			System.out.print(numero + "+");
			suma = suma + numero;

		}
		if (numero <= 30) {
			System.out.print(numero);
		}

		System.out.print("=" + suma);

		sc.close();
	}
}
