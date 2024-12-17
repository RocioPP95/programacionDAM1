package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio5Tema2 {
//	aqui no haria falta poner el scanner ya que no pode nada al usuario que escriba
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer numeros= 0;
		Integer suma=0;
		
				while (numeros<10000) {
				
				System.out.println(numeros);
				numeros= numeros +1; //esto es igual a num++; esto es que le sume uno al numero
				suma=suma + numeros; //esto es igual a suma+=num
				
				}
				System.out.println(suma);
		
		sc.close();

	}
}
