package repaso2FijoMovil;

public class App {
	public static void main(String[] args) {
		
		Movil movil = new Movil(654654654, "Sevilla");
		Fijo fijo = new Fijo(954954954, "Calle Coria");
		
		System.out.println(movil.consultarNumero());
		System.out.println(fijo.consultarNumero());

		movil.marcar(654654654);
		movil.marcar(610610610);
		movil.colgar();
		movil.colgar();
	}
}
