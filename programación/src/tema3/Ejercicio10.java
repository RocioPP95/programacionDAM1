package tema3;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i;
		do {
			System.out.println("Escribe un número mayor a 2:");
			i = sc.nextInt();
		} while (i <= 2);

		// llenar el array ((SACAR EL ARRAY DEL DO WHILE PARA QUE LO LEA EL SIFUIENTE
		// FOR)
		Integer[] fibonacci = new Integer[i];
		Integer numero;
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

		}
		// Imprimir lo que hat en el array
		for (i = 0; i < fibonacci.length; i++) {
			System.out.print(fibonacci[i] + " ");
		}

		sc.close();

	}

}
