package ejercicioEntregable;

import java.util.Objects;

public class Producto {
	private String descripcion;
	private String codigoBarras;
	public Producto(String descripcion, String codigoBarras) {
		super();
		this.descripcion = descripcion;
		this.codigoBarras = codigoBarras;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoBarras);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigoBarras, other.codigoBarras);
	}
	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", codigoBarras=" + codigoBarras + "]";
	}

	
}
