package ejercicioEntregable;

import java.math.BigDecimal;

public class Caracteristicas {
	private BigDecimal precio;
	private Integer cantidad;
	
	
	public Caracteristicas(BigDecimal precio, Integer cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Caracteristicas [precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	
}
