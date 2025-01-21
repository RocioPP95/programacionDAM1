package AlumnoEj;

public class Profesor extends Persona {
	private String dni;

	@Override
	public String toString() {
		return "Profesor [getNombre()=" + getNombre() + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
