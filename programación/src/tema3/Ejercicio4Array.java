package tema3;

import java.util.Scanner;

public class Ejercicio4Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer i;
	System.out.println("¿Cuántos números nos vas a decir?");
	i = sc.nextInt();
	Integer[] numeros = new Integer[i];

	// llenar el array del 1 al i
	for (i = 0; i < numeros.length; i++) {
		System.out.println("Introduce los números");
		Integer numero = sc.nextInt();
		numeros[i] = numero;
	}
	// Imprimir lo que hat en el array al revés 
	for (i = numeros.length-1; i >= 0; i--) {
		System.out.println(numeros[i]);
	}

	sc.close();
}
}
