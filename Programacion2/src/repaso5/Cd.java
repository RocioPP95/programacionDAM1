package repaso5;

import java.time.LocalDate;

public class Cd extends Publicacion implements IPrestable {
	private Boolean prestado;

	public Cd(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.prestado = false;
	}

	@Override
	public String toString() {
		return super.toString() + "[prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {
		if (estaPrestado() == true) {
			System.out.println("No está disponible");
			return;
		}
		this.prestado = true;

		// TODO Auto-generated method stub

	}

	@Override
	public void devolver() {
		if (estaPrestado() == false) {
			System.out.println("No tienes que devolverlo");
			return;
		}
		this.prestado = false;

		// TODO Auto-generated method stub
	}

	@Override
	public Boolean estaPrestado() {
		return this.prestado;

		// TODO Auto-generated method stub

	}

}
