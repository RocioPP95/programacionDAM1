package tema3;

import java.util.Iterator;

public class Repaso6 {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer nota = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			nota = listaNotas[i];
			if (nota < 5) {
				listaNotas[i] = 5;
			}

		}
		System.out.print("Lista notas: ");
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.print(listaNotas[i] + " ");

		}

	}
}