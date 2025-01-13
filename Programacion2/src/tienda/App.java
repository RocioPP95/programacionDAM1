package tienda;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido/a a BlasCommerce!");
		System.out.println("Por favor, indica tu nombre y dni");
		String nombre = sc.nextLine();
		String dni = sc.nextLine();
		Cliente cliente = new Cliente(nombre, dni);

		Carrito carrito = new Carrito(cliente);

		Catalogo catalogo = new Catalogo();
		Integer opcion;
		do {
			System.out.println("�Q�e quieres comprar?");
			catalogo.mostrar();
			Integer idProducto = sc.nextInt();
			Producto elegido = catalogo.obtenerProducto(idProducto);
			System.out.println("�Cu�ntas unidades?");
			Integer cantidad = sc.nextInt();

			carrito.a�adirProducto(elegido, cantidad);

			System.out.println("�Quieres comprar m�s(0 si, 1 no)?");
			opcion = sc.nextInt();
		} while (opcion != 0);

		carrito.mostrarPedido();

		sc.close();
	}
}
