package AlumnoEj;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;

	private Double nota;
	private Curso curso;

	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", curso=" + curso + "]";
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

		if (dni.isEmpty() || dni == null || dni.length() < 9 || dni.length() > 9) {
			return false;

		}

		return true;

//		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
//		Matcher match = patron.matcher(dni);
//		if (match.matches()) {
//			return true;
//		} else {
//			return false;
//		}

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

	public boolean validar() {
		if (this.validarDNI() && this.curso != null && this.getNombre() != null
				&& this.getNombre().length() >= 10 && this.getEdad() != null && this.getEdad() >= 12
				&& this.getEdad() <= 65) {

			return true;
		}

		return false;
	}
}
