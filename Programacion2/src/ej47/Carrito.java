package ej47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private List<Articulo> listaArticulos;
	private Cliente cliente;
	
	public Carrito(Cliente cliente) {
		super();
		this.cliente=cliente;
		this.fechaCreacion = LocalDate.now();
		this.listaArticulos = new ArrayList<>();
		this.fechaActualizacion = LocalDate.now();

	}

	private void actualizar() {
		this.fechaActualizacion = LocalDate.now();
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(List<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	public Integer getCantidad() {
		return this.listaArticulos.size();
	}

	public Double getTotal() {
		Double total = 0.0;
		for (Articulo articulo : listaArticulos) {
			total = total + articulo.getPrecio();
		}
		return total;
	}

	public Double getPrecioMedio() {
		return getTotal() / this.listaArticulos.size();
	}

	public String toString() {
		
		
		return "Nombre: " + cliente.getNombre() + " DNI:" + cliente.getDni() + getTotal() + "euros" + this.fechaActualizacion;
	}

	public void aadArticulo(Articulo x) {
		this.listaArticulos.add(x);
	}

	public void borrarArticulo(Integer x) {
		this.listaArticulos.remove(x);

	}
	public void vaciarCesta() {
		this.listaArticulos.removeAll(listaArticulos);
	}
}
