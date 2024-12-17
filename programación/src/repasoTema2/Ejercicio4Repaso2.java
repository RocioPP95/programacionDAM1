package repasoTema2;

import java.util.Scanner;

public class Ejercicio4Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double precio;
		Double unidades;
		Double totalConDescuento=0.0;
		System.out.println("Introduce el precio");
		precio = sc.nextDouble();
		System.out.println("Introduce unidades");
		unidades = sc.nextDouble();
		Double totalSinDescuento = precio * unidades;
		if (unidades > 100) {
			totalConDescuento = totalSinDescuento * 0.40;

		} else if (unidades >= 25 && unidades >= 100) {
			totalConDescuento = totalSinDescuento * 0.20;

		} else if (unidades >= 10 && unidades <= 24) {
			totalConDescuento = totalSinDescuento * 0.10;

		} else if (unidades < 10) {
			totalConDescuento = totalSinDescuento * 1;

		}
		System.out.println("Subtotal = " + unidades + "x" + precio + "=" + totalConDescuento + "euros");

		sc.close();
	}

}
