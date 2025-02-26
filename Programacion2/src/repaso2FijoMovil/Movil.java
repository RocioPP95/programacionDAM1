package repaso2FijoMovil;

public class Movil extends Telefono {

	private LocalizacionGps loca;

	public Movil(Integer numero, LocalizacionGps posicionGps) {
		super(numero);
		this.loca = posicionGps;
	}

	

	public void colgar() {

	}
}
