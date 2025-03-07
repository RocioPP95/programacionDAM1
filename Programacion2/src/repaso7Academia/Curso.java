package repaso7Academia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Curso {
	private String nombre;
	private LocalDate fechainicio;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer plazasTotales;
	private Integer plazasOcupadas;

	public Curso(String nombre, BigDecimal precio, Integer plazasTotales) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.plazasTotales = plazasTotales;
		this.plazasOcupadas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getPlazasTotales() {
		return plazasTotales;
	}

	public void setPlazasTotales(Integer plazasTotales) {
		this.plazasTotales = plazasTotales;
	}

	public Integer getPlazasOcupadas() {
		return plazasOcupadas;
	}

	public void setPlazasOcupadas(Integer plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}

	public Integer getDuracionCurso() {
		Period periodo = this.fechainicio.until(this.fechaFin);
		return periodo.getMonths() + periodo.getYears() * 12;
	}

	public Boolean isPlazasLibre() {

		if (this.plazasTotales > this.plazasOcupadas) {
			return true;
		} else
			return false;

	}

	public BigDecimal getPrecioMes() {
		BigDecimal meses= new BigDecimal ( getDuracionCurso());
		return precio.divide(meses,2, RoundingMode.HALF_DOWN);

		
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechaFin=" + fechaFin + ", precio="
				+ precio + ", plazasTotales=" + plazasTotales + ", plazasOcupadas=" + plazasOcupadas + "]";
	}
	
}
