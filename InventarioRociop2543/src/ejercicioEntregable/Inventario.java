package ejercicioEntregable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Inventario {

	private Map<Producto, Caracteristicas> productos;

	public Inventario() {
		super();
		this.productos = new HashMap<>();

	}

	public void agregarPtoducto(Producto producto, Caracteristicas caracteristicas) {

		for (Entry<Producto, Caracteristicas> entry : productos.entrySet()) {
			if (productos.containsKey(producto)) {
				entry.getValue().getPrecio().equals(caracteristicas.getPrecio());
				entry.getValue().getCantidad().equals(caracteristicas.getCantidad() + 1);

			} else {
				productos.put(producto, caracteristicas);
			}

		}

	}

	public Boolean venderProducto(String codigoBarras, Integer cantidad) {

		for (Entry<Producto, Caracteristicas> entry : productos.entrySet()) {
			if (entry.getKey().getCodigoBarras().equals(codigoBarras)) {

				if (entry.getValue().getCantidad() >= cantidad) {
					return true;

				} else
					return false;
			}

		}

		return false;

	}

	public String mostrarInventario() {
		return "Inventario [productos=" + productos + "]";
	}

	public String productoMasCaro() {
		Producto productoMasCaro = null;
		BigDecimal precioCaro = BigDecimal.ZERO;
		if (productos.isEmpty()) {
			return "Inventario vacío";
		}

		for (Entry<Producto, Caracteristicas> entry : productos.entrySet()) {
			if (entry.getValue().getPrecio().compareTo(precioCaro) > 0) {
				productoMasCaro = entry.getKey();
			}
		}
		return productoMasCaro.getDescripcion();

	}

	public void eliminarAgotados() {
		// No se utilizar el iterator, porque me he acostumbrado a utilizar el removeIf
		// Lo he intentado pero no me sale
		productos.entrySet().removeIf(entry -> entry.getValue().getCantidad().equals(0));

	}

	public List<Producto> productosConStockMayorA(Integer cantidad) {
		List<Producto> nuevaLista = new ArrayList<>();
		for (Entry<Producto, Caracteristicas> entry : productos.entrySet()) {
			if (entry.getValue().getCantidad() > cantidad) {
				nuevaLista.add(entry.getKey());
			}
		}

		return nuevaLista;

	}
}
