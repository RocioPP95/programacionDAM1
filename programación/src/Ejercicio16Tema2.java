import java.util.Scanner;

public class Ejercicio16Tema2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	
	for (Integer numeros=0, suma=0;numeros<=10000;numeros++,suma+=numeros) {
		
		System.out.println(suma);
	}
	
	
	sc.close();
}
}
