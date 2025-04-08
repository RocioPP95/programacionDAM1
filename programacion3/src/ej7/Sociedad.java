package ej7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Ej6.ParametroIncorrectoException;
import Ej6.Persona;

public class Sociedad {

	private Set<Persona> personas;

	public Sociedad() {
		personas = new HashSet<>();
	}

	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		Persona p = new Persona();
		try {
			p.setGenero(genero);
			p.setAltura(altura);
			personas.add(p);
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public BigDecimal calcularAlturaMediaH() throws ListaVaciaException {
		return calcularAlturaMedia("H");
	}

	public BigDecimal calcularAlturaMediaM() throws ListaVaciaException {
		return calcularAlturaMedia("M");
	}

	public BigDecimal calcularAlturaMediaTodos() throws ListaVaciaException {
		return calcularAlturaMedia(null);
	}

	private BigDecimal calcularAlturaMedia(String genero) throws ListaVaciaException {
		BigDecimal altura = BigDecimal.ZERO;
		Integer cont = 0;
		for (Persona persona : personas) {
			if (genero == null || persona.getGenero().equalsIgnoreCase(genero)) {
				cont++;
				altura = altura.add(persona.getAltura());
			}
		}
		if (cont == 0) { // La lista es vacía o no hay ninguno del género indicado
			throw new ListaVaciaException("No hay personas");
		}
		return altura.divide(BigDecimal.valueOf(cont));
	}

	public void borrarGenero(String genero) throws ParametroIncorrectoException {
		if (genero.equalsIgnoreCase("h") && genero.equalsIgnoreCase("m")) {
			throw new ParametroIncorrectoException("El genero indicado no es correcto");
		}

		if (personas.removeIf(persona -> persona.getGenero().equals(genero)) != false) {
			throw new ParametroIncorrectoException("No hay personas de ese género");
		}

//		Iterator<Persona> it = personas.iterator();
//		while (it.hasNext()) {
//			if (it.next().getGenero().equalsIgnoreCase(genero)) {
//				it.remove();
//			}
//		}
	}

}
