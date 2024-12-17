package tema3;

import java.util.Scanner;

public class Repaso13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		Boolean correcto;
		do {
			
		
		System.out.println("Introduce tu email: ");
		email = sc.nextLine();
		 correcto = emailCorrecto(email);
		} while (correcto==false);
		

		sc.close();
	}

//Esto es un metodo para que me haga  todo lo que le guarde
	public static Boolean emailCorrecto(String email) {
		Boolean correcto = false;

		if (email.contains("@") && !email.endsWith(".") && email.length() > 10) {
		 correcto = true;
		}
		return correcto;
	}

}
