package Ej34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejer34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> palabras = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dime una cadena:");
			palabras.add(sc.nextLine());
		}
		System.out.println(palabras);

		for (int i = 0; i < palabras.size(); i++) {
			palabras.set(i, palabras.get(i).toUpperCase());
		}
		System.out.println(palabras);
		
		
		if (palabras.contains("")) {
			System.out.println("Hay alguna palabra vacía");
		}
		
		
		Iterator<String> it = palabras.iterator();
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

		
		System.out.println(palabras);
		
		
		
		
		sc.close();
	}

}
