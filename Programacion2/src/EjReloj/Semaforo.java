package EjReloj;

public class Semaforo {
	private String colorRojo = "Rojo";
	private String colorAmbar = "Ámbar";
	private String colorVerde = "Verde";
	private Boolean parpadeando;

	public Semaforo(String colorRojo, Boolean parpadeando) {
		super();
		parpadeando = false;
		colorRojo = "Rojo";

	}

	public String getColorRojo() {
		return colorRojo;
	}

	public void setColorRojo(String colorRojo) {
		this.colorRojo = colorRojo;
	}

	public String getColorAmbar() {
		return colorAmbar;
	}

	public void setColorAmbar(String colorAmbar) {
		this.colorAmbar = colorAmbar;
	}

	public String getColorVerde() {
		return colorVerde;
	}

	public void setColorVerde(String colorVerde) {
		this.colorVerde = colorVerde;
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		this.parpadeando = parpadeando;
	}

}
