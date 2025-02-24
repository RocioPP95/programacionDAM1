package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Boolean correcto = false;
		CuentaAhorros cuenta;
		String numero = null;

		while (correcto == false) {
			correcto = true;
			System.out.println("Introduce un número de cuenta");
			numero = sc.nextLine();
			if (numero.length() != 20 ) {
				correcto = false;
			}
		}
		cuenta=new CuentaAhorros(numero);
		Cargo cargo= new Cargo(new BigDecimal(100),"468564B");
		Cargo cargo1= new Cargo(new BigDecimal(150),"852564B");
		Ingreso ingreso= new Ingreso(new BigDecimal(35),"ingreso diario");
		Ingreso ingreso1= new Ingreso(new BigDecimal(25),"ingreso diario");
		Retirada retirada = new Retirada(new BigDecimal(50));
		
		cuenta.añadirMovimiento(cargo);
		cuenta.añadirMovimiento(cargo1);
		cuenta.añadirMovimiento(ingreso);
		cuenta.añadirMovimiento(ingreso1);
		cuenta.añadirMovimiento(retirada);

		System.out.println(cuenta.obtenerTotal());
		System.out.println(cuenta.listaCadenas());
		System.out.println(cuenta.devolverCargos());
		System.out.println(cuenta.devolverIngresos());
		System.out.println(cuenta.devolverRetiradas());

		sc.close();
	}
}
