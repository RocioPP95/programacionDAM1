package tema3;

import java.util.Scanner;

public class Ejercicio9 {
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
		// Imprimir lo que hat en el array
		for (i = 0; i < numeros.length; i++) {
			 for (int j = i+1; j < numeros.length ; j++) {
			        if (numeros[j]<numeros[i]){
			            int aux = numeros[j];
			            numeros[j] = numeros[i];
			            numeros[i] = aux;
			        }
			    }
			 System.out.print(numeros[i] + " ");
		
		}

		sc.close();
	}
}
