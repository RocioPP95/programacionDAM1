package Ej31;

import java.util.Date;

public class Fecha {

	private Integer dia;
	private Integer mes;
	private Integer año;
	private Integer diasAño;
	private Integer añoNacimiento;
	private Integer siglo;
	private Date fecha;

	public Fecha(Integer dia, Integer mes, Integer año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	@Override
	public String toString() {
		return año + "-" + mes + "-" + dia;
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

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public Boolean validarFecha() {
		if ((año > 999 || año <= 2025) && (mes > 0 || mes <= 12) && (dia > 0 || dia <= 31)) {
			return true;

		} else
			return false;

	}

	public Integer calcularEdad(Integer año, Integer añoNacimiento) {
		return año - añoNacimiento;

	}

	public String calcularSiglo(Integer año) {
		if (año % 100 == 0) {
			siglo = año / 100;
		} else {
			siglo = (año / 100) + 1;
		}
		return "Estamos en el siglo: " + siglo;

	}

	public Boolean esBisiesto(Integer diasAño) {
		if ((año / 4 == 0 && año / 100 != 0) || (año / 400 == 0)) {
			return true;
		}
		return false;
	}

//te dice la fecha y hora actual pero no lo hemos dado aun
	public Date obtenerFechaActual() {
		return new Date(año);

	}

}