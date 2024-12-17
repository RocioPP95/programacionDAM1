package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner (System.in); 
		
		//Solicita por consola al usuario cuál  es su altura y peso (en dos pasos) 
		System.out.println("Indique su altura?");
		Double estatura = scanner.nextDouble();
		System.out.println("Indique su peso?") ;
		// Recoge los datos y calcula el IMC
		Double peso = scanner.nextDouble();
		Double IMC = peso / (estatura * estatura );
		String mensaje ="";
			 if ( IMC <18.5 ) {
				mensaje= "Peso inferior al normal";
			}
		else if ( IMC<=24.9) {
			mensaje = "Peso normal";
		}
		else if( IMC<=29.9) {
			mensaje= "Peso superior al normal";
		}
		else if ( IMC>=30.0 ) {
			mensaje= "Obesidad";
		}
		//Muestra por consola el resultado del IMC calculado
		System.out.println("Su IMC es de " + IMC + mensaje);
	
		scanner.close();
	}

}
