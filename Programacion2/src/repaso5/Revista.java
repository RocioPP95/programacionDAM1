package repaso5;

import java.time.LocalDate;

public class Revista extends Publicacion {
	private Boolean consultado;

	public Revista(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.consultado = false;
	}

	@Override
	public String toString() {
		return super.toString() +"[consultado=" + consultado + "]";
	}

}
