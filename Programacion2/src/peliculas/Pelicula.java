package peliculas;

import java.util.ArrayList;
import java.util.List;

import ejercicioCEU.Jugador;

public class Pelicula {
	private Integer añoEstreno;
	private String titulo;
	private Guionista guionista;
	private Director director;
	private List<Actor> listaActores;

	public Pelicula() {
		super();

		this.listaActores = new ArrayList<>();
	}

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

}
