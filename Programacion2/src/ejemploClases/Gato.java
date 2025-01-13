package ejemploClases;

//extends seguido de la clase de la que vaya a heredar los datos
public class Gato extends Mascota {
	private Integer numVidas;

	// constructores
	public Gato() {
		numVidas = 7;
	}
	
	public Gato(Integer numVidasInicial) {
		numVidas=numVidasInicial;
	}

	// métodos
	public Integer getNumVidas() {
		return numVidas;
	}

	public void setNumVidas(Integer numVidas) {
		this.numVidas = numVidas;
	}
}
