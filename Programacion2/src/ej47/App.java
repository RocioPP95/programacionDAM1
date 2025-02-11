package ej47;

public class App {
	public static void main(String[] args) {
		Cliente blas = new Cliente( "12345678x","Blas de los Montes");
		Carrito carro = new Carrito(blas);
		System.out.println(carro);
		
		
		Ropa ropa=new Ropa();
		ropa.setPrecio(20.0);
		ropa.setDescripcion("Poncho");
		ropa.setColor("azul");
		ropa.setTalla("XL");
		
		carro.aadArticulo(ropa);
		carro.aadArticulo(ropa);
		
		System.out.println(carro.getListaArticulos());
		
		Libro libro= new Libro();
		libro.setPrecio(15.00);
		libro.setDescripcion("Así habló Zaratustra");
		libro.setAutor("Nietzsche");
		 
		carro.aadArticulo(libro);
		
		System.out.println(carro.getListaArticulos());
		
		carro.borrarArticulo(1);
		
		System.out.println(carro.getListaArticulos());
		
		carro.vaciarCesta();
		
		System.out.println(carro.getPrecioMedio());
	
		
		
		
	}

}
