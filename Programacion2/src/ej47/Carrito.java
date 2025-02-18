package ej47;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Set<Articulo>articulos;
	private Cliente cliente;

	public Carrito(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
		this.articulos=new HashSet<>();

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

	

	public void setListaArticulos( Set<Articulo>articulos) {
		this.articulos = articulos;
	}

	public Integer getCantidad() {
		return this.articulos.size();
	}

	public BigDecimal getTotal() {
		BigDecimal total = new BigDecimal(0);
		for (Articulo articulo : articulos) {
			total = total.add(articulo.getPrecio()) ;
		}
		return total;
	}

	public BigDecimal getPrecioMedio() {
		if (getCantidad() == 0) {
			return BigDecimal.ZERO;
		}
		BigDecimal cantidadDec = new BigDecimal(getCantidad());
		return getTotal().divide(cantidadDec, 2, RoundingMode.HALF_DOWN);
	}


	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = this.fechaActualizacion.format(formato);
		DecimalFormat formatDecimal=new DecimalFormat("#,###.00€");

		return "Nombre: " + cliente.getNombre() + " DNI:" + cliente.getDni() + " total: " +formatDecimal.format(getTotal())  + "euros"
				+ " fecha: " + fecha;
	}

	public void aadArticulo(Articulo x) {
		this.articulos.add(x);
		this.fechaActualizacion=LocalDate.now();
	}

	public void borrarArticulo(Articulo articulo) {
		this.articulos.remove(articulo);

	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}


	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}


	public void vaciarCesta() {
		this.articulos.clear();
		// this.listaArticulos.removeAll(listaArticulos);
	}
}
