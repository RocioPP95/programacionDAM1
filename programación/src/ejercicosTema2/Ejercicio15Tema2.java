package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio15Tema2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Integer x;
		Integer solucion;
		System.out.println("Dame un número");
		x=sc.nextInt();
		
		for ( Integer y=0  ; y<=10 ;y=y+1) {
			solucion = x * y;
		 System.out.println(x + "x" + y + "=" + solucion);	
			
		}
		sc.close();
		
	}
}
