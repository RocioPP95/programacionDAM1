package videoJuego;

public class Asesino extends Personaje {

	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer cambiarPuntosVida() {
		
		return 100;
	}

}
