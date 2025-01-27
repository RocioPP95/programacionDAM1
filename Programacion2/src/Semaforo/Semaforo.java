package Semaforo;

public class Semaforo {
	public static final String ROJO = "rojo";
	public static final String VERDE = "verde";
	public static final String AMBAR = "ámbar";

	private String color;
	private Boolean parpadeando;

	public Semaforo() {
		super();
		parpadeando = false;
		color = ROJO;

	}

	@Override
	public String toString() {
		if (color.equals("rojo")) {
			return "Semáforo en ROJO";
		}
		if (color.equals("verde")) {
			return "Semáforo en VERDE";
		}
		if (color.equals("ámbar") && parpadeando == false) {
			return "Semáforo  en ÁMBAR";
		} else
			return "Semáforo en ÁMBAR parpadeando ";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (!color.equals("rojo") && !color.equals("verde") && !color.equals("ámbar")) {

		} else
			this.color = color;
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if ((parpadeando && color.equals(AMBAR)) || !parpadeando) {
			this.parpadeando = parpadeando;
		}
	}

	public void cambiarEstado() {
		if (color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		} else if (color.equals(AMBAR) && parpadeando) {
			parpadeando = false;
		} else if (color.equals(AMBAR)) {
			color = ROJO;
		} else
			color = VERDE;

	}

}
