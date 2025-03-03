package repaso5;

import java.time.LocalDate;

public class Revista extends Publicacion implements IConsultable {
	private Boolean consultado;

	public Revista(String codigo, String autor, String titulo, LocalDate fecha) {
		super(codigo, autor, titulo, fecha);
		// TODO Auto-generated constructor stub
		this.consultado = false;
	}

	@Override
	public String toString() {
		return super.toString() + "[consultado=" + consultado + "]";
	}

	@Override
	public void retirarParaConsulta() {
		this.consultado = true;
		// TODO Auto-generated method stub

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
