package Semaforo;

public class Semaforo {
	public static final String ROJO = "rojo";
	public static final String VERDE = "verde";
	public static final String AMBAR = "�mbar";

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
			return "Semaforo en ROJO";
		}
		if (color.equals("verde")) {
			return "Semaforo en VERDE";
		}
		if (color.equals("ambar") && parpadeando == false) {
			return "Semaforo  en AMBAR";
		} else
			return "Semaforo en AMBAR parpadeando ";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (!color.equals("rojo") && !color.equals("verde") && !color.equals("�mbar")) {

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
