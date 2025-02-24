
package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Ingreso extends Movimiento {
	private String descripcion;

	public Ingreso(BigDecimal numero, String descripcion) {
		super();
		this.descripcion = descripcion;
		this.setImporte(numero);
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = this.getFecha().format(formato);

		DecimalFormat formato1 = new DecimalFormat("#,##0.00 €");
		String cadena="";
		cadena=formato1.format(this.getImporte());
		
		return "I-"+fecha+" - "+cadena+" - "+this.descripcion;
	}

	@Override
	public BigDecimal getOperacion() {
		// TODO Auto-generated method stub
		return importe;
	}

}
