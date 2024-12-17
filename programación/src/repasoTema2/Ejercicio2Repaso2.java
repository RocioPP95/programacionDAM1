package repasoTema2;

import java.util.Scanner;

public class Ejercicio2Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ciudad1;
		String ciudad2;
		String ciudad3;

		System.out.println("Escribe una ciudad");
		ciudad1 = sc.nextLine();

		System.out.println("Escribe segunda ciudad");
		ciudad2 = sc.nextLine();

		System.out.println("Escribe tercera ciudad");
		ciudad3 = sc.nextLine();

		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();

		if (longitud1 < longitud2 && longitud1 < longitud3 && longitud2 < longitud3) {
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);

		} else if (longitud2 < longitud1 && longitud1 < longitud3) {
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		} else if (longitud3 < longitud1 && longitud1 < longitud2) {
			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
		} else if (longitud1 < longitud3 && longitud3 < longitud2) {
			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
		} else if (longitud2 < longitud3 && longitud3 < longitud1) {
			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
		} else {
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
		}
		sc.close();
	} 

}
