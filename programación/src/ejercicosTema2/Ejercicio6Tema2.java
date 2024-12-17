package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio6Tema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("¿Cuál es tu nombre?");
		String nombre = sc.next();
		
		Integer contador =1;
		while (contador <=5) {
			
			System.out.println("Mi nombre es " + nombre + ". Línea " + contador );
			contador = contador + 1;	}
		
				sc.close();
	}
}
