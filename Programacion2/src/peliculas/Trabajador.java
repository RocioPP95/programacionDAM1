package peliculas;

import java.util.ArrayList;
import java.util.List;

import ejercicioCEU.Jugador;

public abstract class Trabajador {
	private String nombre;
	private Integer a�oNacimiento;
	private String nacionalidad;

	public Trabajador() {
		
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", a�oNacimiento=" + a�oNacimiento + ", nacionalidad=" + nacionalidad
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getA�oNacimiento() {
		return a�oNacimiento;
	}

	public void setA�oNacimiento(Integer a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public abstract Integer getSueldo();
}
