package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio19Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (Integer fila1=1;fila1<10;fila1++ ) {
			
			for (Integer fila2=1;fila2<=fila1;fila2++) {
				
				System.out.print(fila2);
				
			}
			System.out.println();
			
		}
		
		sc.close();

	}
}
