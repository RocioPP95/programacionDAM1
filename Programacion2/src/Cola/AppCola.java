package Cola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppCola {
	public static void main(String[] args) {
		ColaCadenas lista = new ColaCadenas();
		lista.aņadirCadenA("primero");
		lista.aņadirCadenA("segundo");
		System.out.println(lista.sacarCadena());
		lista.aņadirCadenA("tercero");

		while (lista.getTamaņo() != 0) {
			lista.sacarCadena();

		}
		lista.aņadirCadenA("cuarto");
		System.out.println(lista.toString());
	}
}
