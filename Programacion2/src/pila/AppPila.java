package pila;

public class AppPila {
	public static void main(String[] args) {
		PilaCadenas lista = new PilaCadenas();
		lista.aņadirCadena("primero");
		lista.aņadirCadena("segundo");
		System.out.println(lista.sacarCadena());
		lista.aņadirCadena("tercero");
		while (lista.getTamaņo()!=0) {
			System.out.println("Estoy sacando: "+ lista.sacarCadena()); 
		}
		lista.aņadirCadena("cuarto");
		System.out.println(lista.toString());
	}
}
