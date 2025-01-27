package Ej31;

import java.util.Scanner;

public class AppFecha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fecha fecha = new Fecha(0, 0, 0);
		Integer dia;
		Integer mes;
		Integer a�o;

		do {

			System.out.println("Introduce el dia actual: ");
			fecha.setDia(sc.nextInt());
			System.out.println("Introduce el mes actual:");
			fecha.setMes(sc.nextInt());
			System.out.println("Introduce el a�o actual:");
			fecha.setA�o(sc.nextInt());
			if (fecha.validarFecha()) {
				System.out.println("La fecha es correcta!");
			} else {
				System.out.println("La fecha es incorrecta.");

			}

		} while (!fecha.validarFecha());

		System.out.println(fecha.calcularSiglo(fecha.getA�o()));
		System.out.println("�En que a�o nacistes?:");
		System.out.println("Tienes " + fecha.calcularEdad(fecha.getA�o(), sc.nextInt()) + " a�os");
		System.out.println();

		System.out.println("�Cu�ntos dias tiene este a�o?");
		if (fecha.esBisiesto(sc.nextInt())) {
			System.out.println("El a�o es bisiesto");

		} else {
			System.out.println("El a�o no es bibiesto");

		}

		sc.close();

	}
}
