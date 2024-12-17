package depresion;

import java.util.Random;

public class Ej1 {
	public static void main(String[] args) {
		Random random = new Random();
		Integer[] listaAleatorios = new Integer[20];
		Integer contador = 0;
		Integer contador1 = 0;
		Integer aleatorio = 0;
		for (int i = 0; i < listaAleatorios.length; i++) {
			aleatorio = random.nextInt(0, 100);
			System.out.print(aleatorio + " ");
			listaAleatorios[i] = aleatorio;
			if (listaAleatorios[i] % 2 == 0) {
				contador++;
			}
		}
		Integer[] listaPares = new Integer[contador];
		for (int i = 0; i < listaPares.length; i++) {
			if (aleatorio % 2 == 0) {
				listaPares[contador1] = listaAleatorios[i];
				contador1++;
			}
		}
		System.out.println();
		for (int i = 0; i < listaAleatorios.length; i++) {
			System.out.print(listaAleatorios[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < listaPares.length; i++) {
			System.out.print(listaPares[i] + " ");
		}
	}
}
