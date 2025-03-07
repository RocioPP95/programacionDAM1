package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listas {
	public static void main(String[] args) {
		// en Set no hay orden
		// no añade el mismo objeto((depende de lo que este en el equals))
		// se utiliza para que en una lista no haya repetidos
		
		Set<String>cadenas= new HashSet<>();
		cadenas.add("blas");
		cadenas.add("blau");
		cadenas.add("blas");
		System.out.println(cadenas);
		
		
		List<String>lista= new ArrayList<>();
		lista.add("blas");
		lista.add("blau");
		lista.add("blas");
		System.out.println(lista);
	}

}
 