package repaso5;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		Cd cd = new Cd("5486", "Adele", "Love", LocalDate.of(2025, 2, 14));
		Libro libro = new Libro("5486", "Carlos Ruiz", "El juego del ángel", LocalDate.of(2022, 7, 10));
		Revista revista = new Revista("5486", "Diario", "Semanal", LocalDate.of(2025, 1, 1));

		cd.prestar();
		libro.prestar();

		libro.retirarParaConsulta();
		revista.retirarParaConsulta();

		System.out.println(cd);
		System.out.println(libro);
		System.out.println(revista);

		libro.devolver();
		libro.retirarParaConsulta();

		libro.prestar();

		System.out.println(cd);
		System.out.println(libro);
		System.out.println(revista);

		cd.devolver();
		libro.terminarConsulta();
		revista.terminarConsulta();

		System.out.println(cd.estaPrestado());
		System.out.println(libro.estaPrestado());
		System.out.println(libro.estaConsultando());
		System.out.println(revista.estaConsultando());

	}
}
