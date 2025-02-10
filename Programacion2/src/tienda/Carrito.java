package tienda;

public class Carrito {

	private Producto[] compra;
	private Cliente cliente;
	private Double total;
	private Integer numArticulos;

	// Constructor
	public Carrito(Cliente cliente) {

		this.cliente = cliente;
		total = 0.0;
		numArticulos = 0;
		compra = new Producto[90];
	}

	public void añadirProducto(Producto producto, Integer cantidad) {
		compra[numArticulos] = producto;
		total = total + producto.getPrecio() * cantidad;
		numArticulos++;
	}

	public void mostrarPedido() {
		System.out.println("Pedido: ");
		for (int i = 0; i < numArticulos; i++) {
			Producto p = compra[i];
			System.out.println(p.getDesceipcion() + " " + p.getMarca() + " " + p.getPrecio());
			System.out.println("------------------------------------------");
			System.out.println("Total pedido: " + total);

		}

	}

}
