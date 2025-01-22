package Ej31;

import java.util.Date;

public class Fecha {

	private Integer dia;
	private Integer mes;
	private Integer a�o;
	private Integer diasA�o;
	private Integer a�oNacimiento;
	private Integer siglo;
	private Date fecha;

	public Fecha(Integer dia, Integer mes, Integer a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return a�o + "-" + mes + "-" + dia;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	public Boolean validarFecha() {
		if ((a�o > 999 || a�o <= 2025) && (mes > 0 || mes <= 12) && (dia > 0 || dia <= 31)) {
			return true;

		} else
			return false;

	}

	public Integer calcularEdad(Integer a�o, Integer a�oNacimiento) {
		return a�o - a�oNacimiento;

	}

	public String calcularSiglo(Integer a�o) {
		if (a�o % 100 == 0) {
			siglo = a�o / 100;
		} else {
			siglo = (a�o / 100) + 1;
		}
		return "Estamos en el siglo: " + siglo;

	}

	public Boolean esBisiesto(Integer diasA�o) {
		if ((a�o / 4 == 0 && a�o / 100 != 0) || (a�o / 400 == 0)) {
			return true;
		}
		return false;
	}

//te dice la fecha y hora actual pero no lo hemos dado aun
	public Date obtenerFechaActual() {
		return new Date(a�o);

	}

}