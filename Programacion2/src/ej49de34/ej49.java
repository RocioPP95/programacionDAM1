package ej49de34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ej49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<String>cadenas= new HashSet<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dime una cadena:");
			cadenas.add(sc.nextLine());
		}
		
		System.out.println(cadenas.toString());
		
		//tengo que hacer uno nuevo para meter las cadenas en mayusculas en este
		Set<String> cadenasMayusculas = new HashSet<>();
		
		for (String string : cadenas) {
			cadenasMayusculas.add(string.toUpperCase());
		}
		System.out.print(cadenasMayusculas);
		
		
		
		if (cadenas.contains("")) {
			System.out.println("Hay alguna palabra vacía");
		}
		
		cadenasMayusculas.removeIf(s-> s.length() < 6);
		System.out.println(cadenasMayusculas);
		
	// la s es una varibale que representa cada elemento del set y no hace falfa crearla antes, seguido de -> s. y la condición 
		//puedo hacer la conción lo larga que yo quiera con 
		//por ejemplo cadenas.removeIf(s -> s.length() < 6 || s.startsWith("j"));
		
		
//		Iterator<String> it = cadenasMayusculas.iterator();
//		while(it.hasNext()) {
//			String palabra = it.next();
//			if (palabra.length() < 6) {
//				it.remove();
//			}
//			
//		}
		
		
		// ALTERNATIVA CON ITERATOR EN EL FOR
//		for (Iterator iterator = palabras.iterator(); iterator.hasNext();) {
//			String palabra = (String) iterator.next();
//			if (palabra.length() < 6) {
//				iterator.remove();
//			}
//		}

		
		
		
		
		
		
		sc.close();
}
}
