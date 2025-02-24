package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ejemploClases.Gato;

public class CuentaAhorros {

	private String numeroCuenta;
	private BigDecimal ahorro;
	private  List<Movimiento> listaMovimientos;

	public CuentaAhorros(String numeroCuenta) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.listaMovimientos = new ArrayList();

	}

	//public Movimiento añadirMovimiento( ) {}

	

	
}
