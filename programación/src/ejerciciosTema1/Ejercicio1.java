package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {
	 // escribir main + ctrl + Space
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); 
	    
		//1.Mostrar un mensaje pidiendo el nombre del usuario
		
		System.out.println("¿Cuás es tu nombre?");
		
		//2.Esperar a que el usuario escrina su nombre y registarlo en una variable	
		
		String nombre =  scanner.nextLine();
		
		
		//3.Mostrar un nuevo mensaje pidiendo el apellido del usuario
		
		System.out.println("¿Cuás es tu apellido?");
		 
		//4. Esperar a que el usuario escriba su apellido y registrarlo en otra variable
		
		String apellido = scanner.nextLine() ;
		
		//5. Mostrar un mensaje final indicando..
		
		System.out.println("Su nombre completo es " + nombre + " " + apellido );
		
		
		
		scanner.close(); // cerrar el scanner 
	}
	
}
 