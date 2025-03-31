import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Geografia geografia = new Geografia();
		Scanner sc = new Scanner(System.in);
		Map<String, String> paises;
		Integer contador = 0;
		String pais;
		String capital;

		while (contador < 5) {
			System.out.println("Introduce un país:");
			pais = sc.nextLine();

			System.out.println("Introduce su capital:");
			capital = sc.nextLine();

			if (geografia.agregarPais(pais, capital) == true) {
				contador--;
			} else
				geografia.agregarPais(pais, capital);
			contador++;
		}
		geografia.imprimirPaises();
		System.out.println(geografia.calcularLongitudMediaPaises());

		System.out.println("Introduce una letra:");
		String letra1 = sc.nextLine();
		geografia.imprimirNumeroPaisesLetra(letra1);

		geografia.mismaLetra();
		geografia.eliminarPaisConCapitalLetra(letra1);
		geografia.mismaLetra();
		sc.close();
	}
}
