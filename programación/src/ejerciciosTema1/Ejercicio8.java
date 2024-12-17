package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Realizar un programa que obtenga por teclado los siguientes datos;

		System.out.println("Escribe un número");
		String a= sc.nextLine();

		System.out.println("Escrine un número decimal");
		Double b =sc.nextDouble();
		
		System.out.println("Escribe un número entero");
		Float c = sc.nextFloat();
		//Realiza las conversiones//
		Long x1 = Long.parseLong(a); // Convierte String a Long
        String x2 = b.toString(); // Convierte Double a String
        Integer x3 = b.intValue(); // Convierte Double a Integer
        Long x4 = c.longValue(); // Convierte Float a Long

        
        // Imprime el valor de todas las variables x1, x2, x3 y x4;

        System.out.println("Valor de x1 (Long): " + x1);
        System.out.println("Valor de x2 (String): " + x2);
        System.out.println("Valor de x3 (Integer): " + x3);
        System.out.println("Valor de x4 (Long): " + x4);
        
        sc.close();

}
}
