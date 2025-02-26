package repaso1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public Smartphone() {
		super();
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		super();
		this.imei = imei;
		this.activo = true;
		this.precio = BigDecimal.ZERO;

	}

	public Smartphone(String marca, String modelo, String imei) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		this.activo = true;
		this.precio = BigDecimal.ZERO;

	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void activar() {
		this.activo = true;
	}

	public void desactivar() {
		this.activo = false;
	}

	public Integer getEdad(LocalDate x) {
		LocalDate fecha = LocalDate.of(2000, 4, 1);
		// primero la fecha mas antigua
		Period periodo = x.until(fecha);
		return periodo.getYears();

	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;

	}

	public void establecerFabricacion(LocalDate x) {
		this.fechaFabricacion = x;
	}

	public BigDecimal getPrecioMasIva() {
		return (this.precio).multiply(new BigDecimal(1.21)).setScale(2, RoundingMode.HALF_DOWN);

	}

	public Boolean isAltaGama(BigDecimal precioBase) {

		if (this.precio.compareTo(precioBase) > 0) {
			return true;
		} else
			return false;

	}

	public Boolean isDatosCompletos() {
		if (imei == null || imei.isBlank() || this.precio == null) {
			return false;
		}
		return true;
	}

	public Boolean isGratis() {
		return precio.equals(BigDecimal.ZERO);//true
	}

	public void rebajar() {
		this.precio = this.precio.subtract(new BigDecimal(10));
	}

	@Override
	public String toString() {
		if (this.activo == false) {
			return marca + "(" + modelo + ")" + "INACTIVO";
		} else

			return marca + "(" + modelo + ")";
	}

}
