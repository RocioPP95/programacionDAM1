package ej47;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		Cliente blas = new Cliente( "12345678x","Blas de los Montes");
		Carrito carro = new Carrito(blas);
		System.out.println(carro);
		
		
		Ropa ropa=new Ropa();
		ropa.setPrecio(new BigDecimal(20));
		ropa.setDescripcion("Poncho");
		ropa.setColor("azul");
		ropa.setTalla("XL");
		
		carro.aadArticulo(ropa);
		carro.aadArticulo(ropa);
		
		System.out.println(carro.getArticulos());
		
		Libro libro= new Libro();
		libro.setPrecio(new BigDecimal(15));
		libro.setDescripcion("Así habló Zaratustra");
		libro.setAutor("Nietzsche");
		 
		carro.aadArticulo(libro);
		
		System.out.println(carro.getArticulos());
		
		carro.borrarArticulo(ropa);
		
		System.out.println(carro.getArticulos());
		
		carro.vaciarCesta();
		
		System.out.println(carro.getPrecioMedio() + "€");
	
		
		
		
	}

}
