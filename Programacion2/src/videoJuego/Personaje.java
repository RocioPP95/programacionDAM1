package videoJuego;

public abstract class Personaje {

	String nombre;
	private String codigo;
	private Integer puntosVida;
	private Integer frecuencia;
	private Integer daño;

	public Personaje(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.daño=10;
		this.frecuencia=5;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public Integer getPuntosVida() {
		return puntosVida;
	}

	

	public void setPuntosVida(Integer puntosVida) {
		this.puntosVida = puntosVida;
	}

	public Integer getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;

	}

	public abstract Integer cambiarPuntosVida();

	public void quitarPuntosVida(Integer daño, Integer Frecuencia) {

		this.puntosVida = this.puntosVida - daño * frecuencia;

	}

	@Override
	public String toString() {
		return  nombre  + codigo + ", puntosVida=" + puntosVida + ", frecuencia="
				+ frecuencia + ", daño=" + daño ;
	}
	
}