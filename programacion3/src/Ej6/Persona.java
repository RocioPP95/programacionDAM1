package Ej6;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public Persona() {
		super();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws ParametroIncorrectoException {
		if (!genero.toUpperCase().equals("H") && !genero.toUpperCase().equals("M")) {
			throw new ParametroIncorrectoException("Introduce el valor H o M");
		}
		this.genero = genero.toUpperCase();
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura.compareTo(BigDecimal.ZERO) <= 0 || altura.compareTo(BigDecimal.valueOf(3)) >= 3) {
			throw new ParametroIncorrectoException("Introduce sólo números comprendido entre 0 y 3, ambos excluidos");
		}
		this.altura = altura;
	}

	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
