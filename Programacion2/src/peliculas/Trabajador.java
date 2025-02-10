package peliculas;

import java.util.ArrayList;
import java.util.List;

import ejercicioCEU.Jugador;

public abstract class Trabajador {
	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;

	public Trabajador() {

	}

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}
                                                                          
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public abstract Integer getSueldo();
}
