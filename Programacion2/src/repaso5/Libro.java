package repaso5;

import java.time.LocalDate;

public class Libro extends Publicacion {
	private Boolean prestado;
	private Boolean consultado;

	public Libro(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.prestado=false;
		this.consultado=false;
	}

	@Override
	public String toString() {
		return super.toString()+" [prestado=" + prestado + ", consultado=" + consultado + "]";
	}

}
