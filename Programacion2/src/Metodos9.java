import java.util.Scanner;

public class Metodos9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palabras = { "rosa", "verde", "azul" };
		System.out.println("Introduce un número: ");
		Integer numero = sc.nextInt();
		String palabra = ArrayUtils.obtenerPalabra(palabras, numero);
		System.out.println(palabra);
		Integer numero1 = ArrayUtils.buscarPalabra(palabras, palabra);
		System.out.println(numero1);
		sc.close();
	}
}
