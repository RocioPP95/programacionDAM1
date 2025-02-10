package Cola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppCola {
	public static void main(String[] args) {
		ColaCadenas lista = new ColaCadenas();
		lista.añadirCadenA("primero");
		lista.añadirCadenA("segundo");
		System.out.println(lista.sacarCadena());
		lista.añadirCadenA("tercero");

		while (lista.getTamaño() != 0) {
			lista.sacarCadena();

		}
		lista.añadirCadenA("cuarto");
		System.out.println(lista.toString());
	}
}
