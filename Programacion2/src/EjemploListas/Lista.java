package EjemploListas;

import java.util.ArrayList;
import java.util.List;

import ejemploClases.Gato;

public class Lista {
	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>();
		List<Gato> lista2 = new ArrayList<>();

		listaNombres.add("moqueta");
		listaNombres.add("gamuza");
		listaNombres.add("bigotes");
		listaNombres.set(1, "calcetines"); // add.int para añadir un indice, el set cambia por la posicion que se ha
											// puesto
		
		
		//(index)borra la posición 1 en este caso calcetines
		listaNombres.remove(1);
		
		//(Objeto)borra el primero que encuentre que sea moqueta 
		listaNombres.remove("moqueta");
		
		//primera posicion 
		Integer posicion = listaNombres.indexOf("bigotes");
		System.out.println("Bigotes esta en la posicion: " + posicion);
		
		if (listaNombres.contains("calcetines")) {
			System.out.println("la lista contiene calcetines");
		}
		
		
		// imprimir la lista
		System.out.println(listaNombres);
		// obtener un elemento de la lista
		System.out.println(listaNombres.get(0));
		// tamaño
		System.out.println("tamaño: " + listaNombres.size());
		// si esta alguno vacio
		System.out.println("Es vacía: " + listaNombres.isEmpty());
		
		// a null nunca se le puede hacer un metodo ni el equals (solo == o !=) tambien se puede imprimir
		
		
		// borrar todo lo que hay en la lista
		// en el parentesis se puede meter una lita solo por si quieres que se borre
		//las cosas que estan en otra lista y la tienes en esta
		listaNombres.clear();
		
	}
}
