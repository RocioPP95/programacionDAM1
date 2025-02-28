package repaso4Libreria;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Libreria libreria = new Libreria("Avda. de los sueños perdidos, 89", 954696954);

		Fisico fisico = new Fisico("El código Da Vinci", "Dan Brown");
		fisico.setNumPaginas(20);
		fisico.setFecha(LocalDate.of(2023, 1, 1));
		fisico.setPeso(10);
		fisico.setAlto(12);
		fisico.setAncho(7);

		Fisico fisico1 = new Fisico("Don Quijote", "Miguel de Cervantes");
		fisico1.setNumPaginas(15);
		fisico1.setFecha(LocalDate.of(2015, 1, 1));
		fisico1.setPeso(10);
		fisico1.setAlto(10);
		fisico1.setAncho(5);

		Digital digital = new Digital("Espérame en el arcoiris", "Laura Vidal");
		digital.setNumPaginas(120);
		digital.setFecha(LocalDate.of(2020, 1, 1));

		Digital digital1 = new Digital("Cuca", "Rocio");
		digital1.setNumPaginas(220);
		digital1.setFecha(LocalDate.of(2022, 1, 1));

		libreria.getListaLibros().add(fisico);
		libreria.getListaLibros().add(fisico1);
		libreria.getListaLibros().add(digital);
		libreria.getListaLibros().add(digital1);

		System.out.println(libreria.obtenerLibroMasAntiguo());
		System.out.println(libreria.obtenerNumPaginasMedio());
		System.out.println(libreria.obtenerPesoTotalDeLibros());
	}
}
