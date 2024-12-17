package tema3;

import java.util.Scanner;

public class Repaso5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		System.out.println("¿Qué nota estás buscando?");
		Integer notaBuscada = sc.nextInt();
		Integer contador = 0;
		for (Integer nota : listaNotas) {
			if (nota > notaBuscada) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " notas mayores a la indicada");
		sc.close();
	}

}
