package tema3;

import java.util.Iterator;

public class Repaso2 {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer aprobados = 0;
		Integer suma = 0;
		Integer media = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			Integer notas = listaNotas[i];
			if (notas >= 5) {
				aprobados++;
				suma = suma + listaNotas[i];
			}

		}
		media = suma / aprobados;
		System.out.println("La media de los aprobados es" + media);
	}

}
