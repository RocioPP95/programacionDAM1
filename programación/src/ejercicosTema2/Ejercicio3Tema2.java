package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio3Tema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Precio sin IVA:");
		Double precioSinIva = sc.nextDouble();

		// cuando se pide texto y luego numero se pone la linea siguiente
		sc.nextLine();

		System.out.println("Tipo de IVA:");
		String tipoDeIva = sc.nextLine();

		Double porcentajeIva = 0.0;

		if (tipoDeIva.equals("Normal")) {
			porcentajeIva = 0.21;
		}

		else if (tipoDeIva.equals("Reducido")) {
			porcentajeIva = 0.10;
		} else if (tipoDeIva.equals("Superreducido")) {
			porcentajeIva = 0.04;

		} else if (tipoDeIva.equals("Exento")) {
			porcentajeIva = 0.0;
		}
		System.err.println("El tipo de IVA indicando no es correcto");

		Double iva = precioSinIva * porcentajeIva;
		Double precioConIva = precioSinIva * iva;

		System.out.println("IVA:" + iva);

		sc.close();
	}
}
