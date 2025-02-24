package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Cargo extends Movimiento {
	private String cif;

	public Cargo(BigDecimal importe, String cif) {
		super();
		this.cif = cif;
		this.setImporte(importe);

	}

	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = this.getFecha().format(formato);

		DecimalFormat formato1 = new DecimalFormat("#,##0.00 €");
		String cadena = formato1.format(this.getImporte());

		return "C-" + fecha + " - " + cadena + " - " + this.cif;
	}

	@Override
	public BigDecimal getOperacion() {
		// TODO Auto-generated method stub
		return importe.negate();
	}

}
