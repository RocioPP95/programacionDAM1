package tienda;

public class Catalogo {
	private Producto[] productos;
	
	public  Catalogo() {
		productos=new Producto[6];
		productos[0]=new Producto(7.32, "Pescanova","Clamares");
		productos[1]=new Producto(8.5,"Mercadona","jamón");
		productos[2]=new Producto(7.32, "Nestlet","chocolate");
		productos[3]=new Producto(8.5,"Puleva","leche");
		productos[4]=new Producto(7.32, "Oreo","galletas");
		productos[5]=new Producto(8.5,"La lechera","jamón");
		
	}
	public void mostrar() {
		System.out.println("Catálogo: ");
		for (int i = 0; i < productos.length; i++) {
			Producto p=productos[i];
			System.out.println(i+":"+p.getDesceipcion()+" "+ p.getMarca()+" "+ p.getPrecio());
			
			
		}
	}
	
	public Producto obtenerProducto(Integer idProducto) {
		return productos[idProducto];
	}
	
}
