package Ej6;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Persona persona = new Persona();
			System.out.println("Introduce un género");
			String genero = sc.nextLine();

			try {
				persona.setGenero(genero);
			} catch (ParametroIncorrectoException e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Introduce la altura");
			BigDecimal altura = sc.nextBigDecimal();
			try {
				persona.setAltura(altura);
			} catch (ParametroIncorrectoException e) {

				System.out.println(e.getMessage());
			}

			System.out.println(persona);
		}
	}
}
