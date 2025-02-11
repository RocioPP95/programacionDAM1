package ej47;

public class App {
	public static void main(String[] args) {
		Cliente blas = new Cliente("Blas de los Montes", "12345678x");
		Carrito carro = new Carrito(blas);
		System.out.println(carro);
		
	}

}
