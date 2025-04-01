package ExcepcionesEjemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Integer a = 4;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el divisor:");

		// Prueba hacer esto ((es importante que el try coja todo el codigo en el que
		// puede hacerse el error)
		try {
			Integer b = sc.nextInt();

			Integer resultado = a / b;
			System.out.println(resultado);
			// y si no
			// No puede entrar en mas de un catch(como el esle if)
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Ha habido un error " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Ha ocurrido un error" + e.getMessage());
		}

		sc.close();
	}

}
