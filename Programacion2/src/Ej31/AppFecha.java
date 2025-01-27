package Ej31;

import java.util.Scanner;

public class AppFecha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fecha fecha = new Fecha(0, 0, 0);
		Integer dia;
		Integer mes;
		Integer año;

		do {

			System.out.println("Introduce el dia actual: ");
			fecha.setDia(sc.nextInt());
			System.out.println("Introduce el mes actual:");
			fecha.setMes(sc.nextInt());
			System.out.println("Introduce el año actual:");
			fecha.setAño(sc.nextInt());
			if (fecha.validarFecha()) {
				System.out.println("La fecha es correcta!");
			} else {
				System.out.println("La fecha es incorrecta.");

			}

		} while (!fecha.validarFecha());

		System.out.println(fecha.calcularSiglo(fecha.getAño()));
		System.out.println("¿En que año nacistes?:");
		System.out.println("Tienes " + fecha.calcularEdad(fecha.getAño(), sc.nextInt()) + " años");
		System.out.println();

		System.out.println("¿Cuántos dias tiene este año?");
		if (fecha.esBisiesto(sc.nextInt())) {
			System.out.println("El año es bisiesto");

		} else {
			System.out.println("El año no es bibiesto");

		}

		sc.close();

	}
}
