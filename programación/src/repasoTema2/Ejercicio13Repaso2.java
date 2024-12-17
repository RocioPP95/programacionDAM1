package repasoTema2;

import java.util.Scanner;

public class Ejercicio13Repaso2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String frase;
	String acumulado="";

			do {
		System.out.println("Escribe una frase");
		frase=sc.nextLine();
		if (!frase.equalsIgnoreCase("FIN")) {
			acumulado = acumulado + frase + "\n"; // esto último es un salto de línea
		}
	} while (!frase.equalsIgnoreCase("FIN") );

		System.out.println(acumulado);
	sc.close();
}
}
