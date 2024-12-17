package tema3;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombreCompleto;
		System.out.println("Su nombre completo:");
		nombreCompleto = sc.nextLine();
		String[] parte = nombreCompleto.split(" ");
	
		System.out.println("Su nombre es  " + parte[0] + " su primer apellido es " + parte[1]
				+ " su segundo apellido es " + parte[3]);

		sc.close();
	}

}
