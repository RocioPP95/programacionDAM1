package tema3;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double[] numeros= {5.4, 3.1, 9.0, 4.7};
		 
		Double suma =0.0;
		for (Double numero : numeros) {
			System.out.println(numero);
			suma+=numero;
		}
		
		System.out.println("La suma es: "+ suma);
		sc.close();
	}

}
