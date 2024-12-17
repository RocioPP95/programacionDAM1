package ejercicosTema2;

import java.util.Scanner;

public class Ejercicio12Tema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String username;
		
		
		do {
		System.out.println("Login: ");
		username =sc.nextLine();
		username = username.trim();  // quita los espacios
		username = username.toUpperCase();
		if (username.length()<10) {
			System.out.println("El username tiene que tener una longitud mayor");
		}
		if (username.contains(" ")) {
			System.out.println("El username no puede contener espacios");
		}
		}
			
	while(username.length()<10 || username.contains(" "));
		
		System.out.println("Perfecto, tu usuario es "+ username);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
