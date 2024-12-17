package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Repaso2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Dame un nñumero");
		Long numero= scanner.nextLong();
		System.out.println( "Dame otro número");
		Long numero2 = scanner.nextLong();
		Long solucion = numero * numero2 ;
		System.out.println("LA solución es " + solucion );
		scanner.close();
	}

}
