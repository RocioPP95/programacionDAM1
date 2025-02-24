package ej54CuentaAhorros;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Movimiento {
	private LocalDate fecha;
	private BigDecimal importe;

	public Movimiento() {
		super();
		this.fecha = LocalDate.now();
		

	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public BigDecimal getImporte() {
		return importe;
	}

}
