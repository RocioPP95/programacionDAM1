package Ejercicios;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	static String dni;

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

	public static Boolean validarDNI() {

		Boolean correcto = true;
		/*
		 * if (dni.isEmpty() || dni == null || dni.length() < 9 || dni.length() > 9) {
		 * return correcto = false;
		 * 
		 * }
		 * 
		 * 
		 * return correcto;
		 */
		String ejemploDni = "00000000T";
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(ejemploDni);
		if (match.matches()) {
			return correcto;
		} else {
			return correcto = false;
		}
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
