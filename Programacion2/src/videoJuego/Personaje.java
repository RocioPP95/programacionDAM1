package videoJuego;

import java.util.Objects;

public abstract class Personaje {

	protected String nombre;
	protected String codigo;
	protected Integer puntosVida;
	protected Integer frecuencia;
	protected Integer daño;

	public Personaje() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public Integer getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	public Integer getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;

	}

	@Override
	public String toString() {
		return nombre + codigo + ", puntosVida=" + puntosVida + ", frecuencia=" + frecuencia + ", daño=" + daño;
	}

	

	public Integer getDaño() {
		return daño;
	}

	public void setDaño(Integer daño) {
		this.daño = daño;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre);
	}



}
