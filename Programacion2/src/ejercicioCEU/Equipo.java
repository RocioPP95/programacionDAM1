package ejercicioCEU;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	private String nombre;
	private Jugador capitan;
	private List<String> listaJugadores;

	public Equipo(String nombre) {
		this.listaJugadores = new ArrayList<>();
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {

		return nombre + "- Capit�n: " + capitan + "- Jugadores: " + listaJugadores;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
