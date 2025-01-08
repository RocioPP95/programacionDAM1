package trimestre2;

public class Libro {
	// Atributos((los datos que queremos guardar del objeto para trabajar con ellos
	// ej:nombre, precio..))
	private String titulo;
	private String autor;
	private Integer numPagina;

	// Constructores

	// Métodos ((funciones que puede hacer un objeto))
	public Double calcularPrecio() {
		Double precio = numPagina * 0.01;
		return precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(Integer numPagina) {
		this.numPagina = numPagina;
	}

	
}