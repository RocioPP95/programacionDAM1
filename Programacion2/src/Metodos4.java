import java.util.Scanner;

public class Metodos4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una cadena");
		String cadena = sc.nextLine();
		System.out.println("Escribe un numero del 1 al 2");
		Integer numero = sc.nextInt();
		sc.nextLine();
		String nuevaCadena = getMayMin(cadena, numero);
		System.out.println(nuevaCadena);
		sc.close();
	}

	public static String getMayMin(String cadena, Integer numero) {
		cadena = cadena.trim();
		if (numero == 1) {
			// Esto es para devolver el metodo que hice en la clase Metodos
			cadena = Metodos.getMayusculas(cadena);
		}
		if (numero == 2) {
			cadena = cadena.toLowerCase();
		}
		return cadena;
	}
}
