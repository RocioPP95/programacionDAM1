package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Escribe tu número favorito");
		Integer numero=sc.nextInt();
		sc.nextLine();
		System.out.println("¿Cuál es tu ciudad favorita?");
		String ciudad =sc.nextLine();
		System.out.println("Número favorito es "+ numero + " Ciudad favorita es " + ciudad);
		sc.close();
	}
}
