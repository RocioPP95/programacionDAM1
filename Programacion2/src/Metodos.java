import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("dime algo:");
		String frase = sc.nextLine();
		String fraseCorregida = getMayusculas(frase);
		System.out.println(fraseCorregida);
		sc.close();

	}

	public static String getMayusculas(String cadena) {
		cadena = cadena.trim().toUpperCase();
		return cadena;

	}

}