package ej7;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

import Ej6.ParametroIncorrectoException;

public class App {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Sociedad sociedad = new Sociedad();
			Boolean mas = true;
			while (mas) {

				System.out.println("¿Quieres incluir más personas? (S/N)");
				sc.nextLine();
				if (sc.nextLine().equalsIgnoreCase("s")) {
					mas = true;
				} else {
					mas = false;
				}
				mas = sc.nextLine().equalsIgnoreCase("s");

			}

			try {
				System.out.println("Altura media hombres: " + sociedad.calcularAlturaMediaH());
			} catch (ListaVaciaException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Altura media mujeres: " + sociedad.calcularAlturaMediaM());
			} catch (ListaVaciaException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Altura media todos: " + sociedad.calcularAlturaMediaTodos());
			} catch (ListaVaciaException e) {
				System.out.println(e.getMessage());
			}

			try {
				sociedad.borrarGenero("h");
			} catch (ParametroIncorrectoException e) {
				System.out.println(e.getMessage());
			}
			try {
				sociedad.borrarGenero("m");
			} catch (ParametroIncorrectoException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
