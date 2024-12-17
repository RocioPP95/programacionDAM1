package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//1.Mostrar un mensaje pidiendo el año de nacimiento del usuario
		
		System.out.println("¿Cual es tu año de nacimiento");
		
		//2.Esperar a que el usuario conteste 
		
		Integer añoNacimiento = scanner.nextInt();
	
		
		
		//3.Mostar un nuevo mensaje indicando la edad del usuario calculada restando el año actual al año indicado por el usuario
		
		Integer edad = 2024 - añoNacimiento ;
	    
	     System.out.println("tienes" + edad + " " + "años"  );
		//System.out.println("Tienes" + " " +( 2024 - año  ) +" años" ) ;  ((sin la varible de arriba))
		
		
		
		 scanner.close(); // cerrar el scanner
	}

}
