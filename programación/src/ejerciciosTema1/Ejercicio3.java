package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in) ; 
	 
	 //1.Mostar un mensaje pidiendo la edad del usuario
	 
	 System.out.println( "¿Qué edad tienes?" );
	 
	 //2.Esperar a que el usuario escrina su edad y almacenarla en una variable 
	 
	 Integer edad = scanner.nextInt();
	 
	 //3.Mostrar un nuevo mensaje indicando "Su edad es de xx años"
	 
	 System.out.println("Su edad es de" + " " + edad + " años.");
	 
	 scanner.close(); // cerrar el scanner
	 
	
}
	
	
	

	
}
	
	
	
	
	

