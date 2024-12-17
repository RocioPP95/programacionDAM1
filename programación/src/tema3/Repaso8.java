package tema3;

import java.util.Scanner;

public class Repaso8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tu telegrama");
		String telegrama = sc.nextLine();
		Integer contador = 0;
		String[] palabras = telegrama.split(" ");

		for (int i = 0; i < palabras.length; i++) {
			if (!palabras[i].equals("STOP")) {
				contador++;

			}
		}
		System.out.println("El precio es " + contador * 0.24);

		sc.close();
	}

}
