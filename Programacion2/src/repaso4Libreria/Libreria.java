package repaso4Libreria;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libreria {

	private List<Libro> listaLibros;
	private String direccion;
	private Integer tlfn;

	public Libreria(String direccion, Integer tlfn) {
		super();
		this.listaLibros = new ArrayList<>();
		this.direccion = direccion;
		this.tlfn = tlfn;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public Libro obtenerLibroMasAntiguo() {
		if (listaLibros == null || listaLibros.isEmpty()) {
			return null;
		}
		LocalDate fecha = LocalDate.now();
		Libro menor = null;
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getFecha().isBefore(fecha)) {

				fecha = listaLibros.get(i).getFecha();
				menor = listaLibros.get(i);
			}
		}

		return menor;

	}

	public Integer obtenerPesoTotalDeLibros() {
		Integer suma = 0;
		for (int i = 0; i < listaLibros.size(); i++) {
			suma = suma + listaLibros.get(i).getPeso();
		}
		return suma;
	}

	public Integer obtenerNumPaginasMedio() {
		
		return obtenerPesoTotalDeLibros() / listaLibros.size();

	}

}
