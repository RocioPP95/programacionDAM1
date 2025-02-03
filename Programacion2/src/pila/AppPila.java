package pila;

public class AppPila {
	public static void main(String[] args) {
		PilaCadenas lista = new PilaCadenas();
		lista.añadirCadena("primero");
		lista.añadirCadena("segundo");
		System.out.println(lista.sacarCadena());
		lista.añadirCadena("tercero");
		while (lista.getTamaño()!=0) {
			System.out.println("Estoy sacando: "+ lista.sacarCadena()); 
		}
		lista.añadirCadena("cuarto");
		System.out.println(lista.toString());
	}
}
