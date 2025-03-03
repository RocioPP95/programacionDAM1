package repaso6Ahorcado;

import java.util.Random;

public class SelectorPalabras {
	private String[] palabras;
	private Random r;
	protected String palabraSeleccionada;
	private Integer aleatorio;


	public SelectorPalabras() {
		super();
		this.r = new Random();
		this.palabras = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };

	}

	public void seleccionarPalabra() {
		this.aleatorio = r.nextInt(0, 10);
		this.palabraSeleccionada = palabras[aleatorio];
		
	}

	public String getPalabraSeleccionada() {
		return palabraSeleccionada;
	}

}
