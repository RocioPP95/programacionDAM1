package Ejercicios;

public class Curso {
	private Integer identificador;
	private String descripcion;

	@Override
	public String toString() {
		return "Curso [descripcion=" + descripcion + "]";
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
