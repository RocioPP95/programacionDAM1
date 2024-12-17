import java.util.Scanner;

public class Repasooooo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Boolean correcto = true;
		Boolean correcto1 = true;
		String[] gatos;
		Boolean repetido = false;
		do {
			correcto = true;
			System.out.println("¿Cuántos gatos tienes?");
			numero = sc.nextInt();
			gatos = new String[numero];
			if (numero < 0) {
				correcto = false;
			}
			if (numero == 0) {
				System.out.println("no tienes gatos");
				sc.close();
				return;
			}
		} while (correcto == false);
		sc.nextLine();
		for (int i = 0; i < gatos.length; i++) {

			do {
				correcto1 = true;
				System.out.println("¿Cual es el nombre del gato " + (i + 1) + "?");
				gatos[i] = sc.nextLine();

				if (gatos[i].length() <= 6) {
					correcto1 = false;
				}
				for (int j = 0; j < i; j++) {
					if (gatos[i].equals(gatos[j])) {
						repetido = true;
					}
				}
			} while (correcto1 == false || repetido);

		}
		String masLargo = gatos[0];
		for (int i = 0; i < gatos.length; i++) {
			if (masLargo.length() > gatos[i].length()) {
				masLargo = gatos[i];
			}
		}
		System.out.println("el nombre mas largo es "+masLargo);
		sc.close();
	}
}
