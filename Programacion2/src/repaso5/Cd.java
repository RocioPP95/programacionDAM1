package repaso5;

import java.time.LocalDate;

public class Cd extends Publicacion {
	private Boolean prestado;

	public Cd(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.prestado=false;
	}

	@Override
	public String toString() {
		return super.toString()+  "[prestado=" + prestado + "]";
	}

}
