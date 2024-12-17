package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio10Tema2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String palabra1;
		String palabra2;
		
		
		System.out.println("Escribe una palabra");
		palabra1=sc.nextLine();
		System.out.println("Escribe otra palabra");
		palabra2=sc.nextLine();
		
		while (  palabra1.isBlank() || palabra2.isBlank()) {
			System.out.println("Escribe una palabra");
			palabra1=sc.nextLine();
			System.out.println("Escribe otra palabra");
			palabra2=sc.nextLine();
		}
		

		if (palabra1.compareTo(palabra2)>0) {
			System.out.println(palabra2 + palabra1);
		} 
		else
			System.out.println(palabra1 + palabra2);
		
		
		sc.close();
		
	}
}
