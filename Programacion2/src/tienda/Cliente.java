package tienda;

public class Cliente {
	private String nombre;
	private String dni;

	// constructor

	public Cliente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	// metodos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
