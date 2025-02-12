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
		

		
		System.out.println();
		
		
		if (cadenas.contains("")) {
			System.out.println("Hay alguna palabra vacía");
		}
		
		
		Iterator<String> it = cadenas.iterator();
		while(it.hasNext()) {
			String palabra = it.next();
			if (palabra.length() < 6) {
				it.remove();
			}
			
		}
		
		// ALTERNATIVA CON ITERATOR EN EL FOR
//		for (Iterator iterator = palabras.iterator(); iterator.hasNext();) {
//			String palabra = (String) iterator.next();
//			if (palabra.length() < 6) {
//				iterator.remove();
//			}
//		}

		
		System.out.println(cadenas);
		
		
		
		
		sc.close();
}
}
