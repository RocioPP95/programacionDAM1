import java.util.Scanner;

public class Ejercicio13Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto;
		String texto1;
		Integer x = 0;
		Integer y = 5;

		System.out.println("Escribe un texto: ");
		texto = sc.nextLine();
		Integer longitudUltimaLetra = texto.length();

		do {

			texto1 = texto.substring(x, y);
			x = x + 5;
			y = y + 5;

			System.out.println(texto1);
			}
		
		while (longitudUltimaLetra > y);
		

				texto1 = texto.substring(x, longitudUltimaLetra);

				System.out.println(texto1);
				
		sc.close();
	}
}
