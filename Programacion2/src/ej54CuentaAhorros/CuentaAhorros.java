package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ejemploClases.Gato;

public class CuentaAhorros {

	private String numeroCuenta;
	private BigDecimal ahorro;
	private List<Movimiento> listaMovimientos;

	public CuentaAhorros(String numeroCuenta) {
		super();

		this.numeroCuenta = numeroCuenta;
		this.listaMovimientos = new ArrayList();
		ahorro = BigDecimal.ZERO;
	}

	public void añadirMovimiento(Movimiento x) {

		ahorro = ahorro.add(x.getOperacion());
		listaMovimientos.add(x);

	}

	public BigDecimal obtenerTotal() {

		return ahorro;

	}

	public List<String> listaCadenas() {

		List<String> listaCadenas = new ArrayList<String>();
		for (Movimiento movimiento : listaMovimientos) {
			listaCadenas.add(movimiento.toString());

		}
		return listaCadenas;

	}

	public List<String> devolverRetiradas() {
		List<String> listaCadenas = new ArrayList<String>();
		for (Movimiento movimiento : listaMovimientos) {

			if (movimiento.toString().contains("R-")) {
				listaCadenas.add(movimiento.toString());
				
			}

		}
		return listaCadenas;
	}

	public List<String> devolverIngresos() {
		List<String> listaCadenas = new ArrayList<String>();
		for (Movimiento movimiento : listaMovimientos) {

			if (movimiento.toString().contains("I-")) {
				listaCadenas.add(movimiento.toString());


			}

		}
		return listaCadenas;
	}

	public List<String> devolverCargos() {
		List<String> listaCadenas = new ArrayList<String>();

		for (Movimiento movimiento : listaMovimientos) {
			if (movimiento.toString().contains("C-")) {
				listaCadenas.add(movimiento.toString());


			}

		}
		return listaCadenas;
	}

}
