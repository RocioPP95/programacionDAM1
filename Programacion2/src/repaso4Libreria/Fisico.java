package repaso4Libreria;



public class Fisico extends Libro {

	public Fisico(String titulo, String autor) {
		super(titulo, autor);
		// TODO Auto-generated constructor stub
	}
	private Integer ancho;
	private Integer alto;
	
	
	public Integer getAncho() {
		return ancho;
	}
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	public Integer getAlto() {
		return alto;
	}
	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	

}
