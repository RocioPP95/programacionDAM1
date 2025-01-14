package trimestre2;

import java.util.Scanner;

public class Ejpizarra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// crear un array del objeto
		// Libro[] libros= new Libro[3];

		Libro x = new Libro();
		Libro y = new Libro();

		// x.titulo = "Libro AAA";
		// y.titulo = "Libro BBB";

		// System.out.println("Libro x: " + x.titulo);
		// System.out.println("Libro y: " + y.titulo);

		System.out.println("Introduce el nombre del autor: ");
		x.setAutor(sc.nextLine());
		System.out.println("Introduce el título del libro: ");
		x.setTitulo(sc.nextLine());
		System.out.println("Introduce el número de paginas");
		x.setNumPagina(sc.nextInt());
		System.out.println(x);

		System.out.println("El precio es " + x.calcularPrecio() + " céntimos");
		sc.close();

	}
}
