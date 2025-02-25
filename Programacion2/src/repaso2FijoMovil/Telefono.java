package repaso2FijoMovil;

public abstract class Telefono {

	private Integer numero;
	private Boolean enLlamada;

	public Telefono(Integer numero) {
		super();
		this.numero = numero;
		this.enLlamada = false;
	}

	public Integer consultarNumero() {
		return this.numero;
	}

	public void marcar(Integer numero) {
		System.out.println("LLamando a " + numero);
		if (this.numero.equals(numero)) {
			System.out.println("Comunicando");

		} else
			
		System.out.println("En comunicación");
		enLlamada = true;
	}

	public void colgar() {
		if (enLlamada == true) {
			System.out.println("COMUNICACIÓN TERMINADA");
			enLlamada = false;
		}
		
	}
}
