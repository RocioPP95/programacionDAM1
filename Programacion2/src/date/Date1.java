package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date1 {
	public static void main(String[] args) {
		// esto es para el formato que quieras (solo en mayusculas los meses)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("Ibtroduce una fecha: ");
		String cadena = sc.nextLine();

		LocalDate fecha = LocalDate.parse(cadena, formatter);
		System.out.println(fecha);
		
		sc.close();

		// se puede crear de dos formas con la fecha actual
		LocalDate fecha1 = LocalDate.now();
		System.out.println(formatter.format(fecha1));
		// o con la fecha que queramos
		LocalDate fecha2 = LocalDate.of(2025, 2, 14);
		System.out.println(fecha2);

		System.out.println(fecha1.getDayOfMonth());
		System.out.println(fecha1.getDayOfWeek());
		System.out.println(fecha1.getMonth());
		// si es bisiesto
		fecha1.isLeapYear();

		// para modificar la fecha hay que poner la variable delante si no no se guarda
		fecha1 = fecha1.withMonth(4);
		System.out.println(fecha1);

		// para sumar 6 semanas por ejemplo
		fecha1 = fecha1.plusWeeks(6);
		System.out.println(fecha1);

		// para restar (minus)
		fecha1 = fecha1.minusWeeks(6);

		// para calcular un periodo entre dos fechas perimero la mas antigua
		Period periodo = fecha1.until(fecha2);
		System.out.println("Tiempo entre las dos fechas");
		System.out.println("dias: " + periodo.getDays());
		System.out.println("meses:" + periodo.getMonths());
		System.out.println("años:" + periodo.getYears());

		// si te pide por ejemplo calcular cuantos meses pasan pues seria los meses que
		// te da mas
		// el resultado de años multiplicado por 12
		
		

	}
}
