import java.util.Scanner;

public class Metodos6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la operaci�n ADD, SUB, MUL O DIV: ");
		String cadena = sc.nextLine();
		System.out.println("Introduce un numero");
		Integer numero = sc.nextInt();
		System.out.println("Introduce otro numero");
		Integer numero1 = sc.nextInt();
		Integer solucion = Calculadora.calcular(cadena, numero, numero1);
		System.out.println("La soluci�n es " + solucion);
		sc.close();
	}
}
