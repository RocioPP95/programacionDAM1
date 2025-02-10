package videoJuego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EquipoCombate {
	private List<Personaje> listaPersonajes;

	public EquipoCombate() {
		super();
		this.listaPersonajes = new ArrayList<>();
	}

	public Boolean comprobarMaxPersonajes(Personaje nuevo) {
		if (this.listaPersonajes.size() >=5) {
			return false;
		}

		for (Personaje personaje : listaPersonajes) {
	        if (personaje.equals(nuevo)) {
	            return false;
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

	@Override
	public int hashCode() {
		return Objects.hash(listaPersonajes);
	}



}
