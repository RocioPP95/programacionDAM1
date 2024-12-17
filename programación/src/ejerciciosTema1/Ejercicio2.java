package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1.Mostrar un mensaje pidiendo el nombre del usuadio
		
		System.out.println("Nombre de usuario: ");
		
		//2.Esperar a que el usuario escriba su nombre
		
		String nombre = scanner.nextLine();
		
		//3.Mostrar un nuevo mensaje indicando: "Bienvenido ( nombre)"
		
		System.out.println("Bienvenido " + nombre );
		
		//4.Mostar un nuevo mensaje indicando: "¿De dónde eres?"
		
		System.out.println("¿De dónde eres?");
		
	    //5.Esperar a que el usuario escriba el lugar de donde vives
		
		String lugar = scanner.nextLine();
		

		//6.Mostrar un mensaje preguntando: " ¿Qué tal se vive en (localidad)?"
		
		
		System.out.println("¿Que tal se vive en " + lugar + "?" );
		
		//7.Esperar a que el usuario escriba una respuesta 
		
		 scanner.nextLine();
		
		//8.Mostar un último mensaje indicando "Gracias. Un saludo"
		
		System.out.println("Gracias.Un saludo");
		
		scanner.close(); // cerrar el scanner
	}	
	 
	}
	
	
