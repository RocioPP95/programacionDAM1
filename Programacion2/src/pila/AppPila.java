package pila;

public class AppPila {
	public static void main(String[] args) {
		PilaCadenas lista = new PilaCadenas();
		lista.a�adirCadena("primero");
		lista.a�adirCadena("segundo");
		System.out.println(lista.sacarCadena());
		lista.a�adirCadena("tercero");
		while (lista.getTama�o()!=0) {
			System.out.println("Estoy sacando: "+ lista.sacarCadena()); 
		}
		lista.a�adirCadena("cuarto");
		System.out.println(lista.toString());
	}
}
