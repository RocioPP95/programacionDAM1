package tema3;

import java.util.Scanner;

public class Repaso4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		System.out.println("¿Qué nota estás buscando?");
		Integer notaBuscada = sc.nextInt();
		Boolean existe = false;
		Integer i = 0;
		Integer posicionEncontrada = 0;
		// algoritmo para bursar
		for (i = 0; i < listaNotas.length; i++) {
			Integer nota = listaNotas[i];
			if (notaBuscada == nota) {
				existe = true;
				posicionEncontrada = i;
				// este break es para que pare en la primera posicion encontrada y no siga ..
				break;
			}

		}
		if (existe == true) {

			System.out.println("La nota buscada existe y está en la posición " + posicionEncontrada);
		} else {
			System.out.println("La nota buscada no existe");
		}

		sc.close();
	}

}
