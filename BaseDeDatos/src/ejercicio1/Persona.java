package ejercicio1;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public Persona() {
		super();
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	public void validar() throws DatosIncompletosException {
		if (dni==null || dni.isBlank()
				||nombre==null || nombre.isBlank()
				||apellidos==null || apellidos.isBlank()
				||fechaNacimiento==null || fechaNacimiento.isAfter(LocalDate.now()))
			throw new DatosIncompletosException("Datos incorrectos");
		{
			
		}
	}

}
