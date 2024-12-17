import java.util.Scanner;

public class Metodos6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer numero = sc.nextInt();
		System.out.println("Introduce otro numero");
		Integer numero1 = sc.nextInt();
		Integer sumaHecha = Calculadora.sumar(numero, numero1);
		System.out.println("La suma es: " + sumaHecha);
		Integer resta = Calculadora.restar(numero, numero1);
		System.out.println("la resta es:" + resta);
		Integer multi = Calculadora.multiplicar(numero, numero1);
		System.out.println("la multiplicación es" + multi);
		Integer divi = Calculadora.dividir(numero, numero1);
		System.out.println("La división es: " + divi);
		sc.close();
	}
}
