package ej56;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ej56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> mapaContador = new HashMap<>();
		int contador = 0;
		
		while(true) {
			System.out.println("Introduce numero");
			Integer numero = sc.nextInt();
			if(numero.equals(0)) break;
			
			/*
			if(mapaContador.containsKey(numero)) {
				mapaContador.put(numero, mapaContador.get(numero)+1);
			} else {
				mapaContador.put(numero, 1);
			}*/
			
			mapaContador.put(numero, mapaContador.getOrDefault(numero, 0)+1);
			
			contador ++;
		}
		
		System.out.println("Numero veces pulsado: "+contador);
		for(Integer num:mapaContador.keySet()) {
			System.out.println(num+"-"+mapaContador.get(num));
		}
		
		Set<Entry<Integer, Integer>> entries = mapaContador.entrySet();
		for(Entry<Integer, Integer> entr:entries) {
			System.out.println(entr.getKey()+"-"+entr.getValue());
		}

		
		sc.close();
	}

}
