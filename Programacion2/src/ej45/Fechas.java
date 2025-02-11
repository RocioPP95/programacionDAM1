package ej45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fechas {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		Integer cadena1;
		Integer cadena2;
		Integer cadena3;
		Boolean correcto = true;
		do {
			correcto = true;
			System.out.println("Introduce tu dia de nacimiento: ");
			cadena1 = sc.nextInt();
			System.out.println("Introduce tu mes de nacimiento");
			cadena2 = sc.nextInt();
			System.out.println("Introduce tu año de nacimiento");
			cadena3 = sc.nextInt();
			if (cadena1 < 0 || cadena1 > 31) {
				correcto = false;
			}
			if (cadena2 < 0 || cadena2 > 12) {
				correcto = false;
			}
			if (cadena3 < 0 || cadena3 > 2025) {
				correcto = false;

			}
		} while (!correcto);

		

		LocalDate fecha = LocalDate.of(cadena3, cadena2, cadena1);
		LocalDate fecha1 = LocalDate.now();

		System.out.println("Nacieste en un año bisiesto: " + fecha.isLeapYear());
		System.out.println("naciste el dia de la semana: " + fecha.getDayOfWeek());
		Period periodo = fecha.until(fecha1);
		System.out.println("tienes " + periodo.getYears() + " años");
		sc.close();

		LocalDate fecha2 = LocalDate.now();
		LocalDate fecha3 = LocalDate.of(2095, 11, 25);

		Period periodo1 = fecha2.until(fecha3);
		System.out.println("Suponiendo que vas a vivir 100 años, te queda de vida; " + periodo1.getDays() + " dias "
				+ periodo1.getMonths() + " meses " + periodo1.getYears() + " años");

		
		LocalDateTime hora = LocalDateTime.now();
		Integer horas = hora.getHour();
		Integer minutos = hora.getMinute();
		Integer segundos = hora.getSecond();
		System.out.println("Hora actual : " + horas + ":" + minutos + ":" + segundos);

	}

}
