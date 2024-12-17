package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Repaso3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Dame un número");
		String numero = scanner.nextLine() ;
		Long a = Long.parseLong(numero);
		System.out.println( "Dame otro número");
		String numero2 =scanner.nextLine () ;
		Long b = Long.parseLong(numero2);
		Long solucion = a * b ;
		System.out.println("LA solución es " + solucion );
		scanner.close();
		
		
	}

}
