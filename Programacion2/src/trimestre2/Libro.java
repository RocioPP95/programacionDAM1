package trimestre2;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, numPagina, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(numPagina, other.numPagina)
				&& Objects.equals(titulo, other.titulo);
	}

	

}