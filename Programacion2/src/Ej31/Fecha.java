package Ej31;

import java.time.LocalDate;

public class Fecha {
	private String dia;
	private String mes;
	private String a�o;

	public Fecha(String dia, String mes, String a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return a�o + "-" + mes + "-" + dia;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	

}
