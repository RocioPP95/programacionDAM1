package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in) ;
		
		//1.Mostrar un mensaje preguntando "¿Cuánto te gustaría ganr al año?"
		
		System.out.println("¿Cuánto te gustaría ganar al año?");
		
		//Esperar a que el usuario contes indicando una cantidad
		
		Double número = scanner.nextDouble() ;
		Double sueldo = número / 12 ;		
		 
		//Mostrar un nuev mensaje " Tu sueldo mensual sería de xx euros" ( calcular xx dividiendo lo indicado por el usuario entre 12)
		
		System.out.println("Tu sueldo mensual sería " + sueldo + " " + "al mes");
	
		
		
		scanner.close(); // cerrar el scanner
		
		
		
		
		
	}

}
