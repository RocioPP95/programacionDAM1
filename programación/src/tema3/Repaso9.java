package tema3;

import java.util.Scanner;

public class Repaso9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean caracter = true;
		Boolean saltoLinea = false;
		System.out.println("Escribe tu HTML: ");
		String texto = sc.nextLine();

		String[] palabras = texto.split("");

		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i].equals("<")) {
				caracter = true;

			} else if (palabras[i].equals(">")) {
				caracter = false;
				if (saltoLinea) {
					System.out.println();
					saltoLinea = false;
				}
			} else if (!caracter) {
				System.out.print(palabras[i]);
				saltoLinea = true;
			}

		}

		sc.close();
	}
}
