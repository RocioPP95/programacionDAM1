package repaso6Ahorcado;

public class Tablero {

	private String[] secreto;
	private String[] tablero;

	public Tablero(String palabraSeleccionada) {
		super();
		this.secreto = palabraSeleccionada.split("");
		this.tablero = palabraSeleccionada.split("");

	}

	

}