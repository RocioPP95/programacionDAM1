package ejemploClases;

public class Programa {
	public static void main(String[] args) {
		Gato bigotes = new Gato();
		bigotes.setEdad(6);
		bigotes.setNumVidas(3);

		Gato calcetines = new Gato();
		calcetines.setRaza("persa");
		System.out.println(calcetines.getRaza());
		System.out.println(calcetines.getNumVidas());
		Perro boby = new Perro();
		Perro cuca = new Perro();

		// si se crea el array con mascota se puede meter tanto perro como gatos
		Mascota[] amigos = new Mascota[4];
		amigos[0] = boby;
		amigos[1] = calcetines;

	}
}
