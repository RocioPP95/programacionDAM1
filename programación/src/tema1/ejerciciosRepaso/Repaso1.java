package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Repaso1 {
	public static final Double NUMERO_PI = 3.14 ;
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Radio: ");
	Double radio = scanner.nextDouble();
	Double circunferencia = radio * 2 ;
	Double area = NUMERO_PI * (radio * radio);
	System.out.println("La circunferencia es " + circunferencia +"cm "+ "y el area es "+   area + "cm al cuadrado" );
	scanner.close();
	
	}

}
