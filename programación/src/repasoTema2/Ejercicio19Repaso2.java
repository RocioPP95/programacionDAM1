package repasoTema2;

import java.util.Scanner;

public class Ejercicio19Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double opcion;
		Double importe;
		Double importe2;
		Double solucion;
		Double solucion2;
		do {

			System.out.println("1-Pasar de Pesetas a Euros");
			System.out.println("2-Pasar de Euros a Pesetas");
			System.out.println("3.Salir");
			System.out.println("Selecciona opción:");
			opcion = sc.nextDouble();
			if (opcion == 1) {
				System.out.println("Introduce el importe en pesetas");
				importe = sc.nextDouble();
				solucion = importe * 0.0012;
				System.out.println(solucion + "euros");

			} else if (opcion == 2) {
				System.out.println("Introduce el importe en euros");
				importe2 = sc.nextDouble();
				solucion2 = importe2 * 0.0012;
				System.out.println(solucion2 + "pesetas");

			}
		} while (opcion != 3);

		sc.close();
	}
}
