package repaso5;

import java.time.LocalDate;

public class Libro extends Publicacion implements IPrestable, IConsultable {
	private Boolean prestado;
	private Boolean consultado;

	public Libro(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.prestado = false;

		this.consultado = false;
	}

	@Override
	public String toString() {
		return super.toString() + " [prestado=" + prestado + ", consultado=" + consultado + "]";
	}

	@Override
	public void prestar() {
		if (estaPrestado() == true) {
			return;
		}
		this.prestado = true;

		// TODO Auto-generated method stub
	}

	@Override
	public void devolver() {
		if (estaPrestado() == false) {
			return;
		}

		this.prestado = false;

		// TODO Auto-generated method stub
	}

	@Override
	public Boolean estaPrestado() {
		// TODO Auto-generated method stub
		return this.prestado;

	}

	@Override
	public void retirarParaConsulta() {
		// TODO Auto-generated method stub
		this.consultado = true;

	}

	@Override
	public void terminarConsulta() {
		this.consultado = false;
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean estaConsultando() {
		// TODO Auto-generated method stub
		return this.consultado;
	}

}
