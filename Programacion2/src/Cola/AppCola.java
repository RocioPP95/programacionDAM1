package Cola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppCola {
	public static void main(String[] args) {
		ColaCadenas lista = new ColaCadenas();
		lista.a�adirCadenA("primero");
		lista.a�adirCadenA("segundo");
		System.out.println(lista.sacarCadena());
		lista.a�adirCadenA("tercero");

		while (lista.getTama�o() != 0) {
			lista.sacarCadena();

		}
		lista.a�adirCadenA("cuarto");
		System.out.println(lista.toString());
	}
}
