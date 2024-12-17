package tema3;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra bonita:");
		String palabra=sc.nextLine();
		String []letras=palabra.split("");
		for (String letra : letras) {
			System.out.println(letra);
		}
		sc.close();
	}
	
}
