package tema3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String[] palabras = {"azulejo", "tenedor", "saltamontes", "carretilla",
				"molinero", "sofisticado", "terremoto", "culinario", "teclado", "primavera"};
		Random r = new Random();
		Integer aleatorio = r.nextInt(0, 10);
		Integer vidas = 10;
		Integer aciertos = 0;
		String palabra = palabras[aleatorio];
		String[] secreto = palabra.split("");
		String[] tablero = palabra.split("");
		for (int i = 1; i < tablero.length; i++) {
			tablero[i] = " _";
		}
		
		
		do {
			// Imprimir tablero
			for (String letra : tablero) {
				System.out.print(letra);
			}
			System.out.println();
			
			// Pedimos letra
			System.out.println("Dime una letra:");
			String letra = sc.nextLine();
			
			// Comprobar si la letra está o no en la palabra
			Boolean acertado = false;
			for (int i = 0; i < secreto.length; i++) {
				if(secreto[i].equals(letra)) {
					acertado = true;
					tablero[i] = letra;
					aciertos++;
				}
			}
			
			// Si no ha acertado, restar vidas
			if (!acertado) {
				vidas--;
				System.out.println("Has fallado!! Te quedan " + vidas + " intentos");
			}
			else {
				// Si ha acertado, damos mensaje y comprobar si ha terminado
				System.out.println("La letra está!!");
				if (aciertos == secreto.length) {
					System.out.println("Felicidades!! Has descubierto la palabra");
					System.out.println("La palabra era: " + palabra);
				}
			}
		}
		while(vidas > 0 && aciertos < secreto.length);
		
		if (vidas == 0) {
			System.out.println("GAME OVER!!");
		}
		

		
		sc.close();
	}

}
