package videoJuego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EquipoCombate {
	private List<Personaje> listaPersonajes;

	public EquipoCombate() {
		super();
		this.listaPersonajes = new ArrayList<>();
	}

	public Boolean comprobarMaxPersonajes() {
		if (this.listaPersonajes.size() > 5) {
			return false;

		} else {
			for (Personaje personaje : listaPersonajes) {
				if (personaje.equals(personaje)) {
					return false;
				}
			}

		}
		return true;
	}

	public Integer sumarPuntos() {
		Integer suma = 0;
		for (Personaje personaje : listaPersonajes) {
			suma = suma + personaje.getPuntosVida();
		}
		return suma;

	}

	public List<Personaje> getListaPersonajes() {
		return listaPersonajes;
	}

	public void setListaPersonajes(List<Personaje> listaPersonajes) {
		this.listaPersonajes = listaPersonajes;
	}

}
