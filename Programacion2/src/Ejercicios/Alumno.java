package Ejercicios;

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
		Boolean correcto;
		Boolean correcto1 = true;

		correcto = true;
		if (dni.isEmpty() || dni == null || dni.length() < 9 || dni.length() > 9) {
			correcto = false;
		}

		if (correcto == true) {
			correcto1 = true;
		}
		if (correcto == false) {
			correcto1 = false;
		}

		return correcto1;
	}
}
