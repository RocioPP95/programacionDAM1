package Ejercicios;

import java.util.Objects;

public class Alumno extends Persona {
	private String dni;

	private Double nota;
	private Curso curso;

	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getDni() {
		return dni.toUpperCase();
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void aprobar() {

		nota = 5.0;

	}

	public Boolean validarDNI() {

		Boolean correcto = true;

		if (dni.isEmpty() || dni == null || dni.length() < 9 || dni.length() > 9) {
			return correcto = false;

		}

		return correcto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
}
