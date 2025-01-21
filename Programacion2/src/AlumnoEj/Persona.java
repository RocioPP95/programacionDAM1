package AlumnoEj;

public class Persona {
	private String nombre;
	private Integer edad;

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
