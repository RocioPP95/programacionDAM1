package repasoTema2;

import java.util.Scanner;

public class Ejercicio14Repaso2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String palabra;


	do {

		System.out.println("Escribe una palabra de al menos 8 carácteres: ");
		palabra = sc.nextLine();
		palabra = palabra.replaceAll("a", "4");
		palabra = palabra.replaceAll("e", "3");
		palabra = palabra.replaceAll("i", "1");
		palabra = palabra.replaceAll("o", "0");
		palabra = palabra.replaceAll("t", "7");
		System.out.println(palabra);

	} while (palabra.length() < 8);



	sc.close();
}
}
