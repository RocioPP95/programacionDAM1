package videoJuego;

public class Parasito extends Personaje{

	public Parasito(String nombre, String codigo) {
		super(nombre, codigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer cambiarPuntosVida() {
		
		return 200;
	}

}
