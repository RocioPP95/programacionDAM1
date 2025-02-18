package ej50Pais;

import java.util.HashSet;
import java.util.Set;

public class AppPais {
	public static void main(String[] args) {
		Set<Pais> paises = new HashSet<>();
		System.out.println(paises);
		Pais pais1 = new Pais("ES", "España");
		Pais pais2 = new Pais("CK", "Islas Cook");
		Pais pais3 = new Pais("CK", "Islas Caimán");

		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);

		System.out.println(paises);

		Pais pais4 = new Pais("es", "España");
		paises.add(pais4);
		System.out.println(paises);

		paises.removeIf(s -> !s.equals(pais1));

		System.out.println(paises);

		paises.removeAll(paises);
		System.out.println(paises);
	}
}
