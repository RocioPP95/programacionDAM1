package tienda;

public class Producto {
	private Double precio;
	private String marca;
	private String desceipcion;
	
	
	
	public Producto(Double precio, String marca, String desceipcion) {
		super();
		this.precio = precio;
		this.marca = marca;
		this.desceipcion = desceipcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", marca=" + marca + ", desceipcion=" + desceipcion + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDesceipcion() {
		return desceipcion;
	}
	public void setDesceipcion(String desceipcion) {
		this.desceipcion = desceipcion;
	}
	
}
