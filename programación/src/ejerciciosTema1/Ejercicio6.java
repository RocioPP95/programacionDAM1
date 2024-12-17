package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {
	
	//ESTO ES UNA CONSTANTE
	
	public static final Double PORCENTAJE_IVA = 0.21 ;

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in) ; 
	
	//Solicita por consola al usuario cuál es el precio sin IVA del árticulo ( puede llevar decimales)
	
	System.out.println("¿Cuál es el precio del artículo sin IVA?");
	
	//Recoge el dato y calcula el iva 
	
	Double precioSinIva = scanner.nextDouble() ;
	Double iva = precioSinIva * PORCENTAJE_IVA ;
	Double precioConIva = precioSinIva + iva ;
	
	//Muestra como resultado en la consola el IVA calculado y el precio final ( la suma del precio sin IVA más el IVA)
	
	System.out.println("El precio final es " + precioConIva);
	
	
	scanner.close(); // cerrar el scanner
	}

}
